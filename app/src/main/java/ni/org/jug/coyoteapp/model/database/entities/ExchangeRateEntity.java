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
}
