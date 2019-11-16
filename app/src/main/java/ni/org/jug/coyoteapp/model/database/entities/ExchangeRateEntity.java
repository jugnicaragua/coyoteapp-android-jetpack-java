package ni.org.jug.coyoteapp.model.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by WebnMobile on 2019-09-11.
 */
@Entity(tableName = "exchange_rate")
public class ExchangeRateEntity {
    @PrimaryKey
    private int exchangeRateId;

    @ColumnInfo(name = "bank_id")
    private Integer bankId;

    @ColumnInfo(name = "purchase_price")
    private String purchasePrice;

    @ColumnInfo(name = "sale_price")
    private String salePrice;

    @ColumnInfo(name = "date")
    public String date;

    public int getExchangeRateId() {
        return exchangeRateId;
    }

    public void setExchangeRateId(int exchangeRateId) {
        this.exchangeRateId = exchangeRateId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
