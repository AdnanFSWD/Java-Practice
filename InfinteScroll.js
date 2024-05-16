"use client";
import React, { useEffect, useState } from "react";
import PropTypes from "prop-types";

/**
 * InfiniteScroll component that enables infinite scrolling behavior.
 * @param {Object} props - The component props.
 * @param {React.ReactNode} props.children - The children elements to be rendered.
 * @param {Function} props.data - Function to fetch initial data.
 * @param {Function} props.fetchMoreData - Function to fetch more data.
 * @param {number} props.itemsPerPage - Number of items to display per page.
 * @returns {JSX.Element} InfiniteScroll component JSX.
 */
const InfiniteScroll = ({ children, data, fetchMoreData, itemsPerPage, totalData }) => {
  const [allDataFetched, setAllDataFetched] = useState(false);
  const [isLoading, setIsLoading] = useState(false);

  useEffect(() => {
    /**
     * Event handler to check if scrolled to the bottom of the page and updates the visible items accordingly.
     * @returns {void}
     */
    const handleScroll = () => {
      const scrolledToBottom = window.innerHeight + window.scrollY >= document.body.offsetHeight;
      if (scrolledToBottom && !allDataFetched) {
        fetchMoreData();
        setIsLoading(true);
      }
    };

    window.addEventListener("scroll", handleScroll);

    return () => {
      window.removeEventListener("scroll", handleScroll);
    };
  }, [allDataFetched, fetchMoreData]);

  useEffect(() => {
    if (data.length === totalData) {
      setAllDataFetched(true);
      setIsLoading(false);
    }
  }, [data, itemsPerPage]);

  return (
    <>
      {React.Children.toArray(children)}
      {isLoading && <div>Loading....</div>}
    </>
  );
};

InfiniteScroll.propTypes = {
  children: PropTypes.node.isRequired,
  data: PropTypes.array.isRequired,
  fetchMoreData: PropTypes.func.isRequired,
  itemsPerPage: PropTypes.number.isRequired,
  totalData: PropTypes.number,
};

export default InfiniteScroll;


_____________________________________________________________________________________________________________________________________________________________________

"use client";
import React, { useEffect, useState } from "react";
import InfiniteScroll from "../../../components/molecules/infinteScroll";

/**
 * Home component representing the home page with infinite scrolling.
 * @returns {JSX.Element} Home component JSX.
 */
const Home = () => {
  const [fetchData, setFetchData] = useState([]);
  const [page, setPage] = useState(1);

  /**
   * Function to fetch data from the API.
   * @returns {void}
   */
  const fetchDataFromApi = async () => {
    try {
      const response = await fetch(`https://jsonplaceholder.typicode.com/posts?_page=${page}&_limit=${10}`);
      if (!response.ok) {
        throw new Error("Failed to fetch data");
      }
      const data = await response.json();
      setFetchData((prevData) => [...prevData, ...data]);
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  };

  useEffect(() => {
    fetchDataFromApi();
  }, [page]);

  /**
   * Function to fetch more data when scrolling to the bottom.
   * @returns {void}
   */
  const fetchMoreData = () => {
    setPage((prevPage) => prevPage + 1);
    // return page;
  };

  return (
    <div>
      <h1>Infinite Scroll Example</h1>
      <InfiniteScroll data={fetchData} fetchMoreData={fetchMoreData} itemsPerPage={10} totalData={100}>
        {fetchData.map((item, index) => (
          <div key={index} className="h-[10vh] w-[100vw] bg-amber-500">
            <div className="border-2 border-stone-950">
              <p className="text-center text-4xl font-600">{item.id}</p>
            </div>
          </div>
        ))}
      </InfiniteScroll>
    </div>
  );
};

export default Home;

