package banco;

public class Conexao {

	public static String conexao;

	public static String get() {
		try {
			if (conexao == null) {
				conexao = "realixar conexao";
			}
			return conexao;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
