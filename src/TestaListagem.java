import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager.getConnection
				("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "1234");
		
			Statement stm = connection.createStatement();
			stm.execute("Select ID, Nome, Descricao from Produto");
			
			ResultSet rst = stm.getResultSet();
				
				while(rst.next()) {
					Integer id = rst.getInt("id");
					System.out.println(id);
					String nome = rst.getString("nome");
					System.out.println(nome);
					String descricao = rst.getString("descricao");
					System.out.println(descricao);

				}					
			connection.close(); 
	}
}

