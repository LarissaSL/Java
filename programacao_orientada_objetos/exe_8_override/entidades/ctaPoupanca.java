package entidades;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ctaPoupanca extends ContaBanco {

	@Override
	public void imprimirExtrato() {
		System.out.println("|     Extrato Conta     |");
		SimpleDateFormat dtForm = new SimpleDateFormat ("dd/mm/aaaa HH:mm:ss");
		Date dtHoje = new Date();
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + dtForm.format(dtHoje));
	}
}
