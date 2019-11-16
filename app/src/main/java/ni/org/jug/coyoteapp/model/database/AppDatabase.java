package ni.org.jug.coyoteapp.model.database;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import ni.org.jug.coyoteapp.model.database.dao.ExchangeRateDao;
import ni.org.jug.coyoteapp.model.database.entities.ExchangeRateEntity;

/**
 * Created by WebnMobile on 2019-09-11.
 */
@Database(entities = {ExchangeRateEntity.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ExchangeRateDao exchangeRateDao();

    private static volatile AppDatabase INSTANCE;

    public static AppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    // Create database here
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "exchangerate_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
