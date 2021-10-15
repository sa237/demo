package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;


import com.example.demo.model.Stock;
import com.example.demo.model.StockAPIBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class HomePageDAO {
    private static final Logger logger = LoggerFactory.getLogger(HomePageDAO.class);

    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public void saveStock(StockAPIBean stock)
    {
        Stock st = new Stock();
        st.setStockName(stock.getDescription());
        st.setStockSymbol(stock.getSymbol());
        st.setChange(stock.getChange_percentage());

        Double tempDouble = 0.0;
        if (stock.getLow() != null && !stock.getLow().equals("")) {
            st.setBuyingPrice(Double.parseDouble(stock.getLow()));
        } else
            st.setBuyingPrice(tempDouble);

        if (stock.getHigh() != null && !stock.getHigh().equals("")) {
            st.setSellingPrice(Double.parseDouble(stock.getHigh()));
        } else
            st.setSellingPrice(tempDouble);

        if (stock.getWeek_52_high() != null && !stock.getWeek_52_high().equals("")) {
            st.setHigh52(Double.parseDouble(stock.getWeek_52_high()));
        } else
            st.setHigh52(tempDouble);

        if (stock.getWeek_52_low() != null && !stock.getWeek_52_low().equals("")) {
            st.setLow52(Double.parseDouble(stock.getWeek_52_low()));
        } else
            st.setLow52(tempDouble);

        if (stock.getLast() != null && !stock.getLast().equals("")) {
            st.setCurrentPrice(Double.parseDouble(stock.getLast()));
        } else
            st.setCurrentPrice(tempDouble);

        st.setMarketType(stock.getExch());

        this.entityManager.merge(st);
        flushAndClear();

    }

    @Transactional
    public void updateStock(StockAPIBean stock, Long id)
    {
        Stock st = this.entityManager.find(Stock.class, id);
        st.setStockName(stock.getDescription());
        st.setStockSymbol(stock.getSymbol());

        st.setChange(stock.getChange_percentage());

        Double tempDouble = 0.0;
        // if (stock.getLow() != null && !stock.getLow().equals("")) {
        //     st.setBuyingPrice(Double.parseDouble(stock.getLow()));
        // } else
        //     st.setBuyingPrice(tempDouble);

        // if (stock.getHigh() != null && !stock.getHigh().equals("")) {
        //     st.setSellingPrice(Double.parseDouble(stock.getHigh()));
        // } else
        //     st.setSellingPrice(tempDouble);


        if (stock.getLow() != null && !stock.getLow().equals("")) {
            st.setBuyingPrice(Double.parseDouble(stock.getLast()));
        } else
            st.setBuyingPrice(tempDouble);

        if (stock.getHigh() != null && !stock.getHigh().equals("")) {
            st.setSellingPrice(Double.parseDouble(stock.getLast()));
        } else
            st.setSellingPrice(tempDouble);

        if (stock.getWeek_52_high() != null && !stock.getWeek_52_high().equals("")) {
            st.setHigh52(Double.parseDouble(stock.getWeek_52_high()));
        } else
            st.setHigh52(tempDouble);

        if (stock.getWeek_52_low() != null && !stock.getWeek_52_low().equals("")) {
            st.setLow52(Double.parseDouble(stock.getWeek_52_low()));
        } else
            st.setLow52(tempDouble);

        if (stock.getLast() != null && !stock.getLast().equals("")) {
            st.setCurrentPrice(Double.parseDouble(stock.getLast()));
        } else
            st.setCurrentPrice(tempDouble);

        st.setMarketType(stock.getExch());
        flushAndClear();

    }

/*    public Stock checkIfStockExists(String symbol) throws NoResultException
    {
        logger.info("Getting user data from database for user ");
        TypedQuery<Stock> query = this.entityManager.createQuery("SELECT c from Stock c where c.stockSymbol = ?1", Stock.class);
        query.setParameter(1, symbol);
        query.setMaxResults(1);
        return query.getSingleResult();
    }*/

    private void flushAndClear() {
        this.entityManager.flush();
        this.entityManager.clear();
    }

}