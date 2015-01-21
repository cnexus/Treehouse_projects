package projects.treehouse.interactivestory.model;

/**
 * Created by Carlos on 1/13/2015.
 */
public class Page {
    private int mImageId;
    private String mStoryText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page(int id, String text, Choice c1, Choice c2){
        mImageId = id;
        mStoryText = text;
        mChoice1 = c1;
        mChoice2 = c2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page(int id, String text){
        mImageId = id;
        mStoryText = text;
        mIsFinal = true;

    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mStoryText;
    }

    public void setText(String storyText) {
        mStoryText = storyText;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}
