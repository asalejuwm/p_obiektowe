public class Book {
    String title;
    String author;
    double[] reviews;
    //konstruktory
    public Book(){
        this.title="";
        this.author="";
        this.reviews = new double[0];
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.reviews=new double[0];
    }
    //gettery
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    //settery
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setReviews(double[] reviews){
        this.reviews = reviews;
    }

    //reszta funkcji
    @Override
    public String toString(){
        return "Book{" + "title=" + title + ", author=" + author + ", reviews=" + printReviews() + '}';
    }

    public String printReviews(){
        String res = "{";
        for(int i=0; i<this.reviews.length; i++){
            res+=this.reviews[i]+", ";
        }
        return res;
    }

    public void addReview(double review){
        double[] newReviews = new double[reviews.length+1];
        System.arraycopy(reviews,0, newReviews,0,reviews.length);
        newReviews[reviews.length]=review;
        this.reviews = newReviews;
    }
    public void removeReview(int index){
        if(index<0||index>=reviews.length){
            throw new IndexOutOfBoundsException("Nieprawidlowy indeks");
        }
        double[] newReviews = new double[reviews.length-1];
        System.arraycopy(reviews,0,newReviews,0,index);
        System.arraycopy(reviews,index+1,newReviews,index,reviews.length-index-1);
        this.reviews = newReviews;
    }
}
