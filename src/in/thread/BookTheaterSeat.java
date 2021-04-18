package in.thread;

/**
 * This Contains method
 * 
 * 1.bookseat which is non-synchronized method due to that both thread gets
 * access and inconsist data was shown
 * 
 * 2.bookSeatSyncMethod which synchronized so when first thread access gets the
 * lock and other thread needed to hold until lock released by thread, by this
 * way appropriate data gets executed
 * 
 * 3.bookSeatSyncBlock which has synchronized block which make only enclosed
 * block to synchronized and other code before block to run by all threads
 * 
 * @author YoGI
 *
 */
public class BookTheaterSeat {

	int totalSeats = 10;
	void bookSeat(int seats) {
		if (totalSeats >= seats) {
			System.out.println("Seats Booked Successfully..");
			totalSeats = totalSeats - seats;
		} else {
			System.out.println("All Seat has been Booked.");
		}
		System.out.println("Remaining Seat : " + totalSeats);
	}

	synchronized public void bookSeatSyncMethod(int seats) {
		System.out.println("INSIDE Sync() bookSeatSyncMethod");
		if (totalSeats >= seats) {
			System.out.println("Sync() Seats Booked Successfully..");
			totalSeats = totalSeats - seats;
		} else {
			System.out.println("Sync() All Seat has been Booked.");
		}
		System.out.println("Sync() Remaining Seat : " + totalSeats);
		System.out.println("Exit Sync() bookSeatSyncMethod");
	}

	void bookSeatSyncBlock(int seats) {
		System.out.println("INSIDE Sync{} bookSeatSyncBlock");
		synchronized (this) {
			if (totalSeats >= seats) {
				System.out.println("Sync{} Seats  Booked Successfully..");
				totalSeats = totalSeats - seats;
			} else {
				System.out.println("Sync{} All Seat has been Booked.");
			}
			System.out.println("Sync{} Remaining Seat : " + totalSeats);
		}
		System.out.println("Exit Sync{} bookSeatSyncBlock");
	}
}

/**
 * Normal method execution without synchronized method
 * 
 * @author YoGI
 *
 */
class MovieTheater implements Runnable {
	BookTheaterSeat bookTheaterSeat;
	int seats;

	public MovieTheater(BookTheaterSeat bookTheaterSeat, int seats) {
		super();
		this.bookTheaterSeat = bookTheaterSeat;
		this.seats = seats;
	}

	public void run() {
		bookTheaterSeat.bookSeat(seats);
		System.out.println("");
	}
}

/**
 * This method simply calls the synchronized method
 * 
 * @author YoGI
 *
 */
class SyncMethodMovieTheater implements Runnable {
	BookTheaterSeat bookTheaterSeat;
	protected int seats;

	public SyncMethodMovieTheater(BookTheaterSeat bookTheaterSeat, int seats) {
		super();
		this.bookTheaterSeat = bookTheaterSeat;
		this.seats = seats;
	}

	@Override
	public void run() {
		bookTheaterSeat.bookSeatSyncMethod(seats);
		System.out.println("");
	}
}

class SyncBlockMovieTheater implements Runnable {
	BookTheaterSeat bookTheaterSeat;
	protected int seats;

	public SyncBlockMovieTheater(BookTheaterSeat bookTheaterSeat, int seats) {
		super();
		this.bookTheaterSeat = bookTheaterSeat;
		this.seats = seats;
	}

	@Override
	public void run() {
		bookTheaterSeat.bookSeatSyncBlock(seats);
		System.out.println("");
	}
}

class MainApp {
	public static void main(String[] args) {
		// Normal Without Synchronized Method
		BookTheaterSeat bookTheaterSeat = new BookTheaterSeat();

		MovieTheater deepakBooking = new MovieTheater(bookTheaterSeat, 7);
		new Thread(deepakBooking).start();

		MovieTheater sureshBooking = new MovieTheater(bookTheaterSeat, 6);
		new Thread(sureshBooking).start();

		// Now Synchronized Method used
		BookTheaterSeat bookTheaterSeatSyncMethod = new BookTheaterSeat();

		SyncMethodMovieTheater deepakSyncMethodBooking = new SyncMethodMovieTheater(
				bookTheaterSeatSyncMethod, 7);
		new Thread(deepakSyncMethodBooking).start();

		SyncMethodMovieTheater sureshSyncMethodBooking = new SyncMethodMovieTheater(
				bookTheaterSeatSyncMethod, 6);
		new Thread(sureshSyncMethodBooking).start();

		// Now Synchronized Method used
		BookTheaterSeat bookTheaterSeatSyncBlock = new BookTheaterSeat();

		SyncBlockMovieTheater deepakSyncBlockBooking = new SyncBlockMovieTheater(
				bookTheaterSeatSyncBlock, 7);
		new Thread(deepakSyncBlockBooking).start();

		SyncBlockMovieTheater sureshSyncBlockBooking = new SyncBlockMovieTheater(
				bookTheaterSeatSyncBlock, 6);
		new Thread(sureshSyncBlockBooking).start();

	}
}