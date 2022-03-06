public class Main {

    public static void main(String[] args) {
        post post = new post();
        post.name = "Иван";
        post.subscription = true;
        post.passport = "3333 №232323";
        post.patronymic = "Иванович";
        post.phone = "8 (812) 1212121";
        post.surname = "Иванов";
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 2;
        post.birthday.year = 2000;
    }
}