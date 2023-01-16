public class Landline implements phone{

   private String myPhoneNo;
   private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging = false;
        isPowerOn = true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;

    }

    @Override
    public void callNumber(String phoneNo) {
if(isPowerOn == true ) {
    System.out.println("you are dialing the no :" + phoneNo);
}
    else{
        System.out.println(" your landline is off");
        }
    }

    @Override
    public void reciveCall(String phoneNo) {

if(isPowerOn && myPhoneNo.equals(phoneNo)){
    this. isRinging = true;
    System.out.println("Hey ,"+myPhoneNo +" you are recive a call");
}
else{
    System.out.println(" Call not received");
}
    }

    @Override
    public boolean answerCall() {
        if(isRinging == true){
            System.out.println("call answered");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {

            return isRinging;
    }
}
