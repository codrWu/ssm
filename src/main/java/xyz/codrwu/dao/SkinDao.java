package xyz.codrwu.dao;

import xyz.codrwu.model.Skin;

public interface SkinDao {
    int deleteByPrimaryKey(String skinId);

    int insert(Skin record);

    int insertSelective(Skin record);

    Skin selectByPrimaryKey(String skinId);

    int updateByPrimaryKeySelective(Skin record);

    int updateByPrimaryKey(Skin record);
}