package dao;

import model.StaffInfoEntity;

import java.sql.ResultSet;
import java.util.List;

public interface StaffDao {

    public StaffInfoEntity create(ResultSet rs);

    public StaffInfoEntity getByPK(int key);

    public StaffInfoEntity login(String email, String password);

    public boolean update(StaffInfoEntity object);

    public void delete(StaffInfoEntity object);

    public List<StaffInfoEntity> getAll();
}
