package shejimoshi.chuangjianmoshi.yuanxing.shenkelong;import java.io.*;/** * @Title: demo * @Package shejimoshi.chuangjianmoshi.yuanxing.shenkelong * @Author: dingyunkai * @Description * @CreateTime: 2023/6/3 20:44 */public class demo {    public static void main(String[] args) throws IOException, ClassNotFoundException {        Citation citation = new Citation();        Student student = new Student();        student.setName("zhang san");        citation.setStudent(student);        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/dingyunkai/ideagzgj/xuexitest/resources/"));        oos.writeObject(citation);        oos.close();        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/dingyunkai/ideagzgj/xuexitest/resources/"));        Citation object = (Citation)ois.readObject();        ois.close();        Student student1 = object.getStudent();        student1.setName("lisi");        System.out.println();    }}