public class TestTrain {
    public static void main(String[] args) {
        new Train();

       /* try{
                   Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/reservation","root","hashtech007");

//here reservation is database name, hash is username and  type password
                    Statement stmt=con.createStatement();
                    String sql = "select * from Reservation.Train";
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next())
                        System.out.println(rs.getInt("Train_ID")  + rs.getString("Train_Name")+
                                rs.getString("From_City")+ rs.getString("To_City")+rs.getString("Departure_Date ")+rs.getTime("Departure_Time"));
                   con.close();
                }catch(Exception e) { System.out.println(e);}*/



    }
}
