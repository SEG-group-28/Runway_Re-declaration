package Model.Objects;

public class Runway {

    /**
     * @runwayNumber
     * @runwayPos - left/right/none (in case of parallel runways)
     * @takeOffRunAvail length of runway available for take-off
     * @takeOffDistAvail TORA + area beyond the runway that is free from obstacles (safe)
     *                         TODA = TORA + Clearway
     * @accStopDistAvail    TORA + stopway, total distance in case of aborted take-off
     *                         ASDA = TORA + Stopway
     * @landDistAvail distance available for landing, starts at the THRESHOLD
     *
     * @stopwayLength
     * @clearwayLength
     * @runwayEndSafeArea
     *
     * @stripEnd area between the end of the runway and the and of the runway strip
     * @approachLandSurf surface between top of obstacle and runway when taking into account angle of descent
     * @takeoffCimbSurf surcace between the runway and top of obstacle when taking int account angle of ascent
     *
     * In case of re-declaration, TORA, TODA, ASDA, LDA must be recalculated in both directions
     * clearway/stopway same in both directions?
     */

    private int runwayNumber;
    private RunwayPosition runwayPos;

    private int takeOffRunAvail;
    private int takeOffDistAvail;
    private int accStopDistAvail;
    private int landDistAvail;

    private int stopwayLength;
    private int clearwayLength;

    private int runwayEndSafeArea;
    private int stripEnd;

    private int approchLandSurf;
    private int takeoffClimbSurf;


    public Runway(int runwayNumber, RunwayPosition runwayPos) {
        this.runwayNumber = runwayNumber;
        this.runwayPos = runwayPos;
    }

    public int getRunwayNumber() {
        return runwayNumber;
    }

    public String getRunwayPos() {
        if(runwayPos == RunwayPosition.LEFT) {
            return "Left";
        } else if(runwayPos == RunwayPosition.RIGHT) {
            return "Right";
        } else {
            return "None";
        }
    }

    public void setRunwayPos(RunwayPosition runwayPos) {
        this.runwayPos = runwayPos;
    }

    public int getTakeOffRunAvail() {
        return takeOffRunAvail;
    }

    public void setTakeOffRunAvail(int takeOffRunAvail) {
        this.takeOffRunAvail = takeOffRunAvail;
    }

    public int getTakeOffDistAvail() {
        return takeOffDistAvail;
    }

    public void setTakeOffDistAvail(int takeOffDistAvail) {
        this.takeOffDistAvail = takeOffDistAvail;
    }

    public int getAccStopDistAvail() {
        return accStopDistAvail;
    }

    public void setAccStopDistAvail(int accStopDistAvail) {
        this.accStopDistAvail = accStopDistAvail;
    }

    public int getLandDistAvail() {
        return landDistAvail;
    }

    public void setLandDistAvail(int landDistAvail) {
        this.landDistAvail = landDistAvail;
    }

    public int getStopwayLength() {
        return stopwayLength;
    }

    public void setStopwayLength(int stopwayLength) {
        this.stopwayLength = stopwayLength;
    }

    public int getClearwayLength() {
        return clearwayLength;
    }

    public void setClearwayLength(int clearwayLength) {
        this.clearwayLength = clearwayLength;
    }

    public int getRunwayEndSafeArea() {
        return runwayEndSafeArea;
    }

    public void setRunwayEndSafeArea(int runwayEndSafeArea) {
        this.runwayEndSafeArea = runwayEndSafeArea;
    }

    public int getStripEnd() {
        return stripEnd;
    }

    public void setStripEnd(int stripEnd) {
        this.stripEnd = stripEnd;
    }

    public int getApprochLandSurf() {
        return approchLandSurf;
    }

    public void setApprochLandSurf(int approchLandSurf) {
        this.approchLandSurf = approchLandSurf;
    }

    public int getTakeoffClimbSurf() {
        return takeoffClimbSurf;
    }

    public void setTakeoffClimbSurf(int takeoffClimbSurf) {
        this.takeoffClimbSurf = takeoffClimbSurf;
    }







}
