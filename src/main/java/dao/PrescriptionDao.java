package dao;

import model.PrescriptionEntity;
import java.sql.ResultSet;
import java.util.List;

public interface PrescriptionDao {
    public PrescriptionEntity create(ResultSet rs);

    public PrescriptionEntity getByPK(int key);

    public boolean update(PrescriptionEntity object);

    public void delete(PrescriptionEntity object);

    public List<PrescriptionEntity> getAll();
}
