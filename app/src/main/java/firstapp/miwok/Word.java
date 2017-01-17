package firstapp.miwok;

/**
 * Created by User on 15/9/2016.
 */
public class Word {

   private String defaultWords ;
    private String miwokWords;


    /** Image resource ID for the word */

       private int imageResourceId = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this word */
               private static final int NO_IMAGE_PROVIDED = -1;
   private int audioID;

    public Word(String miwokWords, String defaultWords,int audioID) {
        this.miwokWords = miwokWords;
        this.defaultWords = defaultWords;
        this.audioID =audioID;
    }
    public Word(String miwokWords, String defaultWords,int imageResourceId,int audioID) {
        this.miwokWords = miwokWords;
        this.defaultWords = defaultWords;
        this.imageResourceId=imageResourceId;
        this.audioID = audioID;
    }

    public String getMiwokWords() {
        return miwokWords;
    }

    public String getDefaultWords() {
        return defaultWords;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
    /**
         * Returns whether or not there is an image for this word.
     */
       public boolean hasImage() {
               return imageResourceId != NO_IMAGE_PROVIDED;
           }
     public int getAudioResourceId() {
        return audioID;
    }
}
