package com.example.music.room;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.music.music.standard.data.StandardSongData;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MyFavoriteMusic_Impl implements MyFavoriteMusic {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MyFavoriteData> __insertionAdapterOfMyFavoriteData;

  private final StandardArtistDataConverter __standardArtistDataConverter = new StandardArtistDataConverter();

  private final EntityDeletionOrUpdateAdapter<MyFavoriteData> __deletionAdapterOfMyFavoriteData;

  private final EntityDeletionOrUpdateAdapter<MyFavoriteData> __updateAdapterOfMyFavoriteData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  public MyFavoriteMusic_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMyFavoriteData = new EntityInsertionAdapter<MyFavoriteData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `MyFavoriteData` (`databaseId`,`source`,`id`,`name`,`imageUrl`,`artists`,`fee`,`pl`,`flag`,`maxbr`,`size`,`url`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MyFavoriteData value) {
        stmt.bindLong(1, value.getDatabaseId());
        final StandardSongData _tmpSongData = value.getSongData();
        if(_tmpSongData != null) {
          stmt.bindLong(2, _tmpSongData.getSource());
          if (_tmpSongData.getId() == null) {
            stmt.bindNull(3);
          } else {
            stmt.bindString(3, _tmpSongData.getId());
          }
          if (_tmpSongData.getName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpSongData.getName());
          }
          if (_tmpSongData.getImageUrl() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpSongData.getImageUrl());
          }
          final String _tmp;
          _tmp = __standardArtistDataConverter.objectToString(_tmpSongData.getArtists());
          if (_tmp == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmp);
          }
          final StandardSongData.NeteaseInfo _tmpNeteaseInfo = _tmpSongData.getNeteaseInfo();
          if(_tmpNeteaseInfo != null) {
            stmt.bindLong(7, _tmpNeteaseInfo.getFee());
            if (_tmpNeteaseInfo.getPl() == null) {
              stmt.bindNull(8);
            } else {
              stmt.bindLong(8, _tmpNeteaseInfo.getPl());
            }
            if (_tmpNeteaseInfo.getFlag() == null) {
              stmt.bindNull(9);
            } else {
              stmt.bindLong(9, _tmpNeteaseInfo.getFlag());
            }
            if (_tmpNeteaseInfo.getMaxbr() == null) {
              stmt.bindNull(10);
            } else {
              stmt.bindLong(10, _tmpNeteaseInfo.getMaxbr());
            }
          } else {
            stmt.bindNull(7);
            stmt.bindNull(8);
            stmt.bindNull(9);
            stmt.bindNull(10);
          }
          final StandardSongData.LocalInfo _tmpLocalInfo = _tmpSongData.getLocalInfo();
          if(_tmpLocalInfo != null) {
            stmt.bindLong(11, _tmpLocalInfo.getSize());
          } else {
            stmt.bindNull(11);
          }
          final StandardSongData.DirrorInfo _tmpDirrorInfo = _tmpSongData.getDirrorInfo();
          if(_tmpDirrorInfo != null) {
            if (_tmpDirrorInfo.getUrl() == null) {
              stmt.bindNull(12);
            } else {
              stmt.bindString(12, _tmpDirrorInfo.getUrl());
            }
          } else {
            stmt.bindNull(12);
          }
        } else {
          stmt.bindNull(2);
          stmt.bindNull(3);
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
        }
      }
    };
    this.__deletionAdapterOfMyFavoriteData = new EntityDeletionOrUpdateAdapter<MyFavoriteData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `MyFavoriteData` WHERE `databaseId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MyFavoriteData value) {
        stmt.bindLong(1, value.getDatabaseId());
      }
    };
    this.__updateAdapterOfMyFavoriteData = new EntityDeletionOrUpdateAdapter<MyFavoriteData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `MyFavoriteData` SET `databaseId` = ?,`source` = ?,`id` = ?,`name` = ?,`imageUrl` = ?,`artists` = ?,`fee` = ?,`pl` = ?,`flag` = ?,`maxbr` = ?,`size` = ?,`url` = ? WHERE `databaseId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MyFavoriteData value) {
        stmt.bindLong(1, value.getDatabaseId());
        final StandardSongData _tmpSongData = value.getSongData();
        if(_tmpSongData != null) {
          stmt.bindLong(2, _tmpSongData.getSource());
          if (_tmpSongData.getId() == null) {
            stmt.bindNull(3);
          } else {
            stmt.bindString(3, _tmpSongData.getId());
          }
          if (_tmpSongData.getName() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpSongData.getName());
          }
          if (_tmpSongData.getImageUrl() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpSongData.getImageUrl());
          }
          final String _tmp;
          _tmp = __standardArtistDataConverter.objectToString(_tmpSongData.getArtists());
          if (_tmp == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmp);
          }
          final StandardSongData.NeteaseInfo _tmpNeteaseInfo = _tmpSongData.getNeteaseInfo();
          if(_tmpNeteaseInfo != null) {
            stmt.bindLong(7, _tmpNeteaseInfo.getFee());
            if (_tmpNeteaseInfo.getPl() == null) {
              stmt.bindNull(8);
            } else {
              stmt.bindLong(8, _tmpNeteaseInfo.getPl());
            }
            if (_tmpNeteaseInfo.getFlag() == null) {
              stmt.bindNull(9);
            } else {
              stmt.bindLong(9, _tmpNeteaseInfo.getFlag());
            }
            if (_tmpNeteaseInfo.getMaxbr() == null) {
              stmt.bindNull(10);
            } else {
              stmt.bindLong(10, _tmpNeteaseInfo.getMaxbr());
            }
          } else {
            stmt.bindNull(7);
            stmt.bindNull(8);
            stmt.bindNull(9);
            stmt.bindNull(10);
          }
          final StandardSongData.LocalInfo _tmpLocalInfo = _tmpSongData.getLocalInfo();
          if(_tmpLocalInfo != null) {
            stmt.bindLong(11, _tmpLocalInfo.getSize());
          } else {
            stmt.bindNull(11);
          }
          final StandardSongData.DirrorInfo _tmpDirrorInfo = _tmpSongData.getDirrorInfo();
          if(_tmpDirrorInfo != null) {
            if (_tmpDirrorInfo.getUrl() == null) {
              stmt.bindNull(12);
            } else {
              stmt.bindString(12, _tmpDirrorInfo.getUrl());
            }
          } else {
            stmt.bindNull(12);
          }
        } else {
          stmt.bindNull(2);
          stmt.bindNull(3);
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
        }
        stmt.bindLong(13, value.getDatabaseId());
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from MyFavoriteData where id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insert(final MyFavoriteData myFavoriteData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfMyFavoriteData.insertAndReturnId(myFavoriteData);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final MyFavoriteData myFavoriteData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMyFavoriteData.handle(myFavoriteData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final MyFavoriteData myFavoriteData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMyFavoriteData.handle(myFavoriteData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteById(final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
    int _argIndex = 1;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteById.release(_stmt);
    }
  }

  @Override
  public List<MyFavoriteData> loadAll() {
    final String _sql = "select * from MyFavoriteData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfDatabaseId = CursorUtil.getColumnIndexOrThrow(_cursor, "databaseId");
      final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfArtists = CursorUtil.getColumnIndexOrThrow(_cursor, "artists");
      final int _cursorIndexOfFee = CursorUtil.getColumnIndexOrThrow(_cursor, "fee");
      final int _cursorIndexOfPl = CursorUtil.getColumnIndexOrThrow(_cursor, "pl");
      final int _cursorIndexOfFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "flag");
      final int _cursorIndexOfMaxbr = CursorUtil.getColumnIndexOrThrow(_cursor, "maxbr");
      final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final List<MyFavoriteData> _result = new ArrayList<MyFavoriteData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MyFavoriteData _item;
        final StandardSongData _tmpSongData;
        if (! (_cursor.isNull(_cursorIndexOfSource) && _cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfImageUrl) && _cursor.isNull(_cursorIndexOfArtists) && _cursor.isNull(_cursorIndexOfFee) && _cursor.isNull(_cursorIndexOfPl) && _cursor.isNull(_cursorIndexOfFlag) && _cursor.isNull(_cursorIndexOfMaxbr) && _cursor.isNull(_cursorIndexOfSize) && _cursor.isNull(_cursorIndexOfUrl))) {
          final int _tmpSource;
          _tmpSource = _cursor.getInt(_cursorIndexOfSource);
          final String _tmpId;
          _tmpId = _cursor.getString(_cursorIndexOfId);
          final String _tmpName;
          _tmpName = _cursor.getString(_cursorIndexOfName);
          final String _tmpImageUrl;
          _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
          final ArrayList<StandardSongData.StandardArtistData> _tmpArtists;
          final String _tmp;
          _tmp = _cursor.getString(_cursorIndexOfArtists);
          _tmpArtists = __standardArtistDataConverter.stringToObject(_tmp);
          final StandardSongData.NeteaseInfo _tmpNeteaseInfo;
          if (! (_cursor.isNull(_cursorIndexOfFee) && _cursor.isNull(_cursorIndexOfPl) && _cursor.isNull(_cursorIndexOfFlag) && _cursor.isNull(_cursorIndexOfMaxbr))) {
            final int _tmpFee;
            _tmpFee = _cursor.getInt(_cursorIndexOfFee);
            final Integer _tmpPl;
            if (_cursor.isNull(_cursorIndexOfPl)) {
              _tmpPl = null;
            } else {
              _tmpPl = _cursor.getInt(_cursorIndexOfPl);
            }
            final Integer _tmpFlag;
            if (_cursor.isNull(_cursorIndexOfFlag)) {
              _tmpFlag = null;
            } else {
              _tmpFlag = _cursor.getInt(_cursorIndexOfFlag);
            }
            final Integer _tmpMaxbr;
            if (_cursor.isNull(_cursorIndexOfMaxbr)) {
              _tmpMaxbr = null;
            } else {
              _tmpMaxbr = _cursor.getInt(_cursorIndexOfMaxbr);
            }
            _tmpNeteaseInfo = new StandardSongData.NeteaseInfo(_tmpFee,_tmpPl,_tmpFlag,_tmpMaxbr);
          }  else  {
            _tmpNeteaseInfo = null;
          }
          final StandardSongData.LocalInfo _tmpLocalInfo;
          if (! (_cursor.isNull(_cursorIndexOfSize))) {
            final long _tmpSize;
            _tmpSize = _cursor.getLong(_cursorIndexOfSize);
            _tmpLocalInfo = new StandardSongData.LocalInfo(_tmpSize);
          }  else  {
            _tmpLocalInfo = null;
          }
          final StandardSongData.DirrorInfo _tmpDirrorInfo;
          if (! (_cursor.isNull(_cursorIndexOfUrl))) {
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            _tmpDirrorInfo = new StandardSongData.DirrorInfo(_tmpUrl);
          }  else  {
            _tmpDirrorInfo = null;
          }
          _tmpSongData = new StandardSongData(_tmpSource,_tmpId,_tmpName,_tmpImageUrl,_tmpArtists,_tmpNeteaseInfo,_tmpLocalInfo,_tmpDirrorInfo);
        }  else  {
          _tmpSongData = null;
        }
        _item = new MyFavoriteData(_tmpSongData);
        final long _tmpDatabaseId;
        _tmpDatabaseId = _cursor.getLong(_cursorIndexOfDatabaseId);
        _item.setDatabaseId(_tmpDatabaseId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
