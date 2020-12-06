package lab10;

import java.util.ArrayList;
import java.util.List;

public class VideoBlog {
    private String videoBloger;
    private List<Video> videos;

    public VideoBlog(String videoBloger){
        this.videoBloger = videoBloger;
        videos = new ArrayList<>();
    }

    public String getVideoBloger() {
        return videoBloger;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void Display(){
        System.out.println("\n VideoBloger: " + videoBloger);
        for(Video video : videos){
            video.Display();
        }
    }

    public void addVideo(Video video){
        videos.add(video);
    }

}
