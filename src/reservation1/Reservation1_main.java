package reservation1;

public class Reservation1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservtion1_control rcontrol = new Reservtion1_control();
		Reservation1_view rview = new Reservation1_view(rcontrol);
		rview.setBounds(5,5,700,500);
		rview.setVisible(true);
	}
}
