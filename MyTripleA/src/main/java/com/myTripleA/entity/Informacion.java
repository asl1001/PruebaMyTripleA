package com.myTripleA.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DatosGenerales")
public class Informacion {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8682898811350791181L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	@Column(length=50)
	private String symbol=null;
	private String name=null;
	private String image=null;
	private Long current_price=null;
	private Long market_cap=null;
	private Long market_cap_rank=null;
	private Long fully_diluted_valuation=null;
	private Long total_volume=null;
	private Long high_24h=null;
	private Long low_high=null;
	private Long price_change_24h=null;
	private Long price_change_percentage_24h=null;
	private Long market_cap_change_24h=null;
	private Long market_cap_change_percentage_24h=null;
	private Long cirulating_price=null;
	private Long total_supply=null;
	private Long max_supply=null;
	private Long ath=null;
	private Long ath_change_percentage=null;
	private String ath_date=null;
	private Long at1=null;
	private Long at1_change_percentage=null;
	private String at1_date=null;
	private String roi=null;
	private String last_updated=null;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Long getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(Long current_price) {
		this.current_price = current_price;
	}
	public Long getMarket_cap() {
		return market_cap;
	}
	public void setMarket_cap(Long market_cap) {
		this.market_cap = market_cap;
	}
	public Long getMarket_cap_rank() {
		return market_cap_rank;
	}
	public void setMarket_cap_rank(Long market_cap_rank) {
		this.market_cap_rank = market_cap_rank;
	}
	public Object getFully_diluted_valuation() {
		return fully_diluted_valuation;
	}
	public void setFully_diluted_valuation(Long fully_diluted_valuation) {
		this.fully_diluted_valuation = fully_diluted_valuation;
	}
	public Long getTotal_volume() {
		return total_volume;
	}
	public void setTotal_volume(Long total_volume) {
		this.total_volume = total_volume;
	}
	public Long getHigh_24h() {
		return high_24h;
	}
	public void setHigh_24h(Long high_24h) {
		this.high_24h = high_24h;
	}
	public Long getLow_high() {
		return low_high;
	}
	public void setLow_high(Long low_high) {
		this.low_high = low_high;
	}
	public Long getPrice_change_24h() {
		return price_change_24h;
	}
	public void setPrice_change_24h(Long price_change_24h) {
		this.price_change_24h = price_change_24h;
	}
	public Long getPrice_change_percentage_24h() {
		return price_change_percentage_24h;
	}
	public void setPrice_change_percentage_24h(Long price_change_percentage_24h) {
		this.price_change_percentage_24h = price_change_percentage_24h;
	}
	public Long getCirulating_price() {
		return cirulating_price;
	}
	public void setCirulating_price(Long cirulating_price) {
		this.cirulating_price = cirulating_price;
	}
	public Long getTotal_supply() {
		return total_supply;
	}
	public void setTotal_supply(Long total_supply) {
		this.total_supply = total_supply;
	}
	public Object getMax_supply() {
		return max_supply;
	}
	public void setMax_supply(Long max_supply) {
		this.max_supply = max_supply;
	}
	
	public String getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
	public Long getMarket_cap_change_24h() {
		return market_cap_change_24h;
	}
	public void setMarket_cap_change_24h(Long market_cap_change_24h) {
		this.market_cap_change_24h = market_cap_change_24h;
	}
	public Long getMarket_cap_change_percentage_24h() {
		return market_cap_change_percentage_24h;
	}
	public void setMarket_cap_change_percentage_24h(Long market_cap_change_percentage_24h) {
		this.market_cap_change_percentage_24h = market_cap_change_percentage_24h;
	}
	public Long getAth() {
		return ath;
	}
	public void setAth(Long ath) {
		this.ath = ath;
	}
	public Long getAth_change_percentage() {
		return ath_change_percentage;
	}
	public void setAth_change_percentage(Long ath_change_percentage) {
		this.ath_change_percentage = ath_change_percentage;
	}
	public String getAth_date() {
		return ath_date;
	}
	public void setAth_date(String ath_date) {
		this.ath_date = ath_date;
	}
	public Long getAt1() {
		return at1;
	}
	public void setAt1(Long at1) {
		this.at1 = at1;
	}
	public Long getAt1_change_percentage() {
		return at1_change_percentage;
	}
	public void setAt1_change_percentage(Long at1_change_percentage) {
		this.at1_change_percentage = at1_change_percentage;
	}
	public String getAt1_date() {
		return at1_date;
	}
	public void setAt1_date(String at1_date) {
		this.at1_date = at1_date;
	}
	public Object getRoi() {
		return roi;
	}
	public void setRoi(String roi) {
		this.roi = roi;
	}
	
	

}
