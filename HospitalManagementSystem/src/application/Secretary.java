package application;

class Secretary extends Person {
  private String userName;
  private String password;

  Secretary(
      String name,
      char gender,
      String address,
      String mobileNumber,
      int age,
      String email,
      String martialStatus,
      String userName,
      String password
  ) 
  {
    super(name, gender, address, mobileNumber, age, email, martialStatus);
    this.userName = userName;
    this.password = password;
  }

  Patient register(String name,
      char gender,
      String address,
      String mobileNumber,
      int age,
      String email,
      String martialStatus) {
	  MedicalHistory medicalHistory = new MedicalHistory();
	  Patient patient = new Patient(name, gender, address, mobileNumber, age, email, martialStatus, mobileNumber, medicalHistory);
	  return patient;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void login(String userName, String password) {
	  SystemManager.loginSecretary(userName, password);
  }

  public void addApointment(String date, String reservationTime, Doctor doctor, boolean excuse) {
    Appointment appointment = new Appointment(date, reservationTime, doctor, excuse);
    SystemManager.addAppointmentToDoctor(doctor, appointment);
  }

  public void editApointment(Doctor doctor, Appointment appointment, Appointment newAppointment) {
	  SystemManager.editAppointment(doctor, appointment, newAppointment);

  }

  public void initiateExcuse(Schedule schedule, Doctor doctor) {
	  //TODO

  }

  public void editSchedule(Schedule schedule) {
	  //TODO

  }

  public void displaySchedule() {
	  //TODO

  }

}
