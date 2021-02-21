package com.example.music.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile MyFavoriteMusic _myFavoriteMusic;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `MyFavoriteData` (`databaseId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `source` INTEGER NOT NULL, `id` TEXT NOT NULL, `name` TEXT NOT NULL, `imageUrl` TEXT, `artists` TEXT, `fee` INTEGER, `pl` INTEGER, `flag` INTEGER, `maxbr` INTEGER, `size` INTEGER, `url` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '673cc16fa8e6cb66cd7cfb6eadcadb48')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `MyFavoriteData`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMyFavoriteData = new HashMap<String, TableInfo.Column>(12);
        _columnsMyFavoriteData.put("databaseId", new TableInfo.Column("databaseId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyFavoriteData.put("source", new TableInfo.Column("source", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyFavoriteData.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyFavoriteData.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyFavoriteData.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyFavoriteData.put("artists", new TableInfo.Column("artists", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyFavoriteData.put("fee", new TableInfo.Column("fee", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyFavoriteData.put("pl", new TableInfo.Column("pl", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyFavoriteData.put("flag", new TableInfo.Column("flag", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyFavoriteData.put("maxbr", new TableInfo.Column("maxbr", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyFavoriteData.put("size", new TableInfo.Column("size", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyFavoriteData.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMyFavoriteData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMyFavoriteData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMyFavoriteData = new TableInfo("MyFavoriteData", _columnsMyFavoriteData, _foreignKeysMyFavoriteData, _indicesMyFavoriteData);
        final TableInfo _existingMyFavoriteData = TableInfo.read(_db, "MyFavoriteData");
        if (! _infoMyFavoriteData.equals(_existingMyFavoriteData)) {
          return new RoomOpenHelper.ValidationResult(false, "MyFavoriteData(com.example.music.room.MyFavoriteData).\n"
                  + " Expected:\n" + _infoMyFavoriteData + "\n"
                  + " Found:\n" + _existingMyFavoriteData);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "673cc16fa8e6cb66cd7cfb6eadcadb48", "d5d0261ccbf8f4eda09af54c465001ca");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "MyFavoriteData");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `MyFavoriteData`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MyFavoriteMusic myFavoriteDao() {
    if (_myFavoriteMusic != null) {
      return _myFavoriteMusic;
    } else {
      synchronized(this) {
        if(_myFavoriteMusic == null) {
          _myFavoriteMusic = new MyFavoriteMusic_Impl(this);
        }
        return _myFavoriteMusic;
      }
    }
  }
}
