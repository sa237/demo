package com.example.demo.model;

public class StockAPIBean {
    private String symbol;
    private String exch;
    private String description;
    private String type;
    private String serverTimestamp;
    private String mode;
    private String prevclose;
    private String trade_date;
    private String change;
    private String change_percentage;

    private String root_symbol;
    private String open;
    private String high = "0.0";
    private String low = "0.0";
    private String close;
    private String option_type;
    private String volume;
    private String week_52_high = "0.0";
    private String expiration_date;
    private String week_52_low = "0.0";
    private String bid_date;
    private String last;
    private String bid;
    private String ask;
    private String average_volume;
    private String last_volume;
    private String bidsize;
    private String bidexch;
    private String asksize;
    private String askexch;
    private String ask_date;

    public StockAPIBean(String symbol, String exch, String description, String type, String serverTimestamp, String mode, String prevclose, String trade_date, String change, String change_percentage, String root_symbol, String open, String high, String low, String close, String option_type, String volume, String week_52_high, String expiration_date, String week_52_low, String bid_date, String last, String bid, String ask, String average_volume, String last_volume, String bidsize, String bidexch, String asksize, String askexch, String ask_date) {
        this.symbol = symbol;
        this.exch = exch;
        this.description = description;
        this.type = type;
        this.serverTimestamp = serverTimestamp;
        this.mode = mode;
        this.prevclose = prevclose;
        this.trade_date = trade_date;
        this.change = change;
        this.change_percentage = change_percentage;
        this.root_symbol = root_symbol;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.option_type = option_type;
        this.volume = volume;
        this.week_52_high = week_52_high;
        this.expiration_date = expiration_date;
        this.week_52_low = week_52_low;
        this.bid_date = bid_date;
        this.last = last;
        this.bid = bid;
        this.ask = ask;
        this.average_volume = average_volume;
        this.last_volume = last_volume;
        this.bidsize = bidsize;
        this.bidexch = bidexch;
        this.asksize = asksize;
        this.askexch = askexch;
        this.ask_date = ask_date;
    }

    @Override
    public String toString() {
        return "StockAPIBean{" +
                "symbol='" + symbol + '\'' +
                ", exch='" + exch + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", serverTimestamp='" + serverTimestamp + '\'' +
                ", mode='" + mode + '\'' +
                ", prevclose='" + prevclose + '\'' +
                ", trade_date='" + trade_date + '\'' +
                ", change='" + change + '\'' +
                ", change_percentage='" + change_percentage + '\'' +
                ", root_symbol='" + root_symbol + '\'' +
                ", open='" + open + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", close='" + close + '\'' +
                ", option_type='" + option_type + '\'' +
                ", volume='" + volume + '\'' +
                ", week_52_high='" + week_52_high + '\'' +
                ", expiration_date='" + expiration_date + '\'' +
                ", week_52_low='" + week_52_low + '\'' +
                ", bid_date='" + bid_date + '\'' +
                ", last='" + last + '\'' +
                ", bid='" + bid + '\'' +
                ", ask='" + ask + '\'' +
                ", average_volume='" + average_volume + '\'' +
                ", last_volume='" + last_volume + '\'' +
                ", bidsize='" + bidsize + '\'' +
                ", bidexch='" + bidexch + '\'' +
                ", asksize='" + asksize + '\'' +
                ", askexch='" + askexch + '\'' +
                ", ask_date='" + ask_date + '\'' +
                '}';
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setExch(String exch) {
        this.exch = exch;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setServerTimestamp(String serverTimestamp) {
        this.serverTimestamp = serverTimestamp;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setPrevclose(String prevclose) {
        this.prevclose = prevclose;
    }

    public void setTrade_date(String trade_date) {
        this.trade_date = trade_date;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public void setChange_percentage(String change_percentage) {
        this.change_percentage = change_percentage;
    }

    public void setRoot_symbol(String root_symbol) {
        this.root_symbol = root_symbol;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public void setOption_type(String option_type) {
        this.option_type = option_type;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setWeek_52_high(String week_52_high) {
        this.week_52_high = week_52_high;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public void setWeek_52_low(String week_52_low) {
        this.week_52_low = week_52_low;
    }

    public void setBid_date(String bid_date) {
        this.bid_date = bid_date;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public void setAverage_volume(String average_volume) {
        this.average_volume = average_volume;
    }

    public void setLast_volume(String last_volume) {
        this.last_volume = last_volume;
    }

    public void setBidsize(String bidsize) {
        this.bidsize = bidsize;
    }

    public void setBidexch(String bidexch) {
        this.bidexch = bidexch;
    }

    public void setAsksize(String asksize) {
        this.asksize = asksize;
    }

    public void setAskexch(String askexch) {
        this.askexch = askexch;
    }

    public void setAsk_date(String ask_date) {
        this.ask_date = ask_date;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getExch() {
        return exch;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getServerTimestamp() {
        return serverTimestamp;
    }

    public String getMode() {
        return mode;
    }

    public String getPrevclose() {
        return prevclose;
    }

    public String getTrade_date() {
        return trade_date;
    }

    public String getChange() {
        return change;
    }

    public String getChange_percentage() {
        return change_percentage;
    }

    public String getRoot_symbol() {
        return root_symbol;
    }

    public String getOpen() {
        return open;
    }

    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    public String getClose() {
        return close;
    }

    public String getOption_type() {
        return option_type;
    }

    public String getVolume() {
        return volume;
    }

    public String getWeek_52_high() {
        return week_52_high;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public String getWeek_52_low() {
        return week_52_low;
    }

    public String getBid_date() {
        return bid_date;
    }

    public String getLast() {
        return last;
    }

    public String getBid() {
        return bid;
    }

    public String getAsk() {
        return ask;
    }

    public String getAverage_volume() {
        return average_volume;
    }

    public String getLast_volume() {
        return last_volume;
    }

    public String getBidsize() {
        return bidsize;
    }

    public String getBidexch() {
        return bidexch;
    }

    public String getAsksize() {
        return asksize;
    }

    public String getAskexch() {
        return askexch;
    }

    public String getAsk_date() {
        return ask_date;
    }
}

