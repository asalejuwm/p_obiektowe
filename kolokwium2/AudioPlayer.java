public class AudioPlayer implements MediaPlayer{
    String currentAudio;

    public void setCurrentAudio(String currentVideo) {
        this.currentAudio = currentVideo;
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
        return currentAudio;
    }
}
