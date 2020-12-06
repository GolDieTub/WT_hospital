package dao;

public interface DaoFactory {

    public PatientDao getPatientDao();

    public StaffDao getStaffDao();

    public PatientDiagnosisDao getPatientDiagnosisDao();

    public DiagnosisInfoDao getDiagnosisInfoDao();

    public PrescriptionDao getPrescriptionDao();

    public ReceptionDao getReceptionDao();
}
