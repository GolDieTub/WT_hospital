package dao;

import model.ReceptionEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public interface ReceptionDao {
    public ReceptionEntity create(ResultSet rs);

    public ReceptionEntity getByPK(int key);

    public boolean update(ReceptionEntity object, Connection connection);

    public void delete(ReceptionEntity object);

    public Integer add(ReceptionEntity object, Connection connection);

    public List<ReceptionEntity> getAll();
}
