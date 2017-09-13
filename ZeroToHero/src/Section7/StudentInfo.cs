using System;

[System.Serializable]
class StudentInfo
{
    public String Name, Address, CourseInfo;
    public int ID;

    public StudentInfo() { }

    public StudentInfo(String n, String a, String ci, int id)
    {
        Name = n;
        Address = a;
        CourseInfo = ci;
        ID = id;
    }

}