package Enum_FaDu.Ex02;

public class User {

    String name;
    int role=0; // role->0 Admin, role->1 Customer,
    int status=0; // status->0 Active, status->1 Login, status->2 Inactive

    Role yetkisi;  // Role enumundan  yetkisi adiyla bir field create edildi.
    Status durumu; // Stayus enumundan  durum adiyla bir field create edildi.


}
