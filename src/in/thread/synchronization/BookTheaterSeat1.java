package in.thread.synchronization;

/**
 * To Avoid Thread issue at Class Level static synchronization to be used.
 * static synchronization provide class level locking
 * 
 * @author YoGI
 *
 */
public class BookTheaterSeat1 {

	static int totalSeatsStatic = 20;
	int totalSeats = 20;

	synchronized public void bookSeat(int seats) {
		if (totalSeats >= seats) {
			System.out.println(seats + " Seats Booked Successfully..");
			totalSeats = totalSeats - seats;
		} else {
			System.out.println(seats + "All Seat has been Booked.");
		}
		System.out.println("Remaining Seat : " + totalSeats);
	}

	synchronized static public void bookSeatStatic(int seats) {
		if (totalSeatsStatic >= seats) {
			System.out.println(seats + "Seats Booked Successfully..");
			totalSeatsStatic = totalSeatsStatic - seats;
		} else {
			System.out.println(seats + "All Seat has been Booked.");
		}
		System.out.println("Remaining Seat : " + totalSeatsStatic);
	}

}

class MyThread1 implements Runnable {
	BookTheaterSeat1 bookTheaterSeat1;
	int seats;

	public MyThread1(BookTheaterSeat1 bookTheaterSeat1, int seats) {
		super();
		this.bookTheaterSeat1 = bookTheaterSeat1;
		this.seats = seats;
	}

	@Override
	public void run() {
		// bookTheaterSeat1.bookSeat(seats);
		BookTheaterSeat1.bookSeatStatic(seats);
	}

}

class MyThread2 implements Runnable {
	BookTheaterSeat1 bookTheaterSeat1;
	int seats;

	public MyThread2(BookTheaterSeat1 bookTheaterSeat1, int seats) {
		super();
		this.bookTheaterSeat1 = bookTheaterSeat1;
		this.seats = seats;
	}

	@Override
	public void run() {
		// bookTheaterSeat1.bookSeat(seats);
		BookTheaterSeat1.bookSeatStatic(seats);
	}

}

class MovieMainApp {
	public static void main(String[] args) {
		BookTheaterSeat1 bookTheaterSeat1 = new BookTheaterSeat1();

		MyThread1 t1 = new MyThread1(bookTheaterSeat1, 7);
		new Thread(t1).start();

		MyThread2 t2 = new MyThread2(bookTheaterSeat1, 6);
		new Thread(t2).start();

		BookTheaterSeat1 bookTheaterSeat2 = new BookTheaterSeat1();

		MyThread1 t3 = new MyThread1(bookTheaterSeat2, 5);
		new Thread(t3).start();

		MyThread2 t4 = new MyThread2(bookTheaterSeat2, 9);
		new Thread(t4).start();
	}
}
