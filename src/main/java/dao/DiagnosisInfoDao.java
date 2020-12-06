package dao;

import model.DiagnosisInfoEntity;

import java.sql.ResultSet;
import java.util.List;

public interface DiagnosisInfoDao {



    public DiagnosisInfoEntity create(ResultSet rs);

    public DiagnosisInfoEntity getByPK(int key);

    public boolean update(DiagnosisInfoEntity object);

    public void delete(DiagnosisInfoEntity object);

    public List<DiagnosisInfoEntity> getAll();
}
