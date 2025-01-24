public class VideoPlayer implements MediaPlayer {
    String currentVideo;

    public void setCurrentVideo(String currentVideo) {
        this.currentVideo = currentVideo;
    }
    @Override
    public void play(String fileName) {
        System.out.println("Playing " + fileName);
    }
    @Override
    public void pause(){
        System.out.println("Pausing");
    }
    @Override
    public String getCurrentTrack(){
        return currentVideo;
    }
}
