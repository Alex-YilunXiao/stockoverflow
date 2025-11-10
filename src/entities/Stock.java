package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import javax.swing.*;

@Getter
@Setter
//@AllArgsConstructor
public class Stock {
    private String ticker;
    private String name;
    private Date date;
    private ImageIcon image;
    private double high;
    private double low;
    private double close;

    public Stock(String ticker, String name/*, Date date, ImageIcon image, double high, double low, double close*/){
    }




}
