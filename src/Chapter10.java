import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter10 {
	public static void main(String[] args) throws Exception {
		List<Task> list = new ArrayList<>();
		list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
		list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
		list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
		list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
		list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

		long count = list.stream().filter(t -> t.isDone() == false).count();
		System.out.println("未完了のタスクの個数は" + count);
		list.stream().filter(t -> t.isDone() == false).sorted((t1, t2) -> t1.getDate().compareTo(t2.getDate()))
		.forEach(System.out::println);
	}
}


// int forEachOrdered = list.stream()
// .sorted((t1,t2) -> t1.getDate() - t2.getDate());
// .forEachOrdered();
// .forEach(System.out::println);
// Comparator<Task> llist =
// Comparator.comparing(Task::isDone).thenComparing(Task::getDate).reversed();
// ソート処理
// llist.stream().sorted(Comparator).forEach(t ->
// System.out.println(task.isDone() + a.getDate() + " "));
