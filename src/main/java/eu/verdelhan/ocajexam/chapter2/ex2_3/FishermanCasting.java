package eu.verdelhan.ocajexam.chapter2.ex2_3;

public class FishermanCasting {
    private static FishingSession fishingSession = new FishingSession();

    private static void castForFish() {
        fishingSession.setBaitAvailable(false);
    }

    public static void main(String[] args) {
        fishingSession.setSession("active");
        int piecesOfBait = 5;
        piecesOfBait = 0; // Fox steals the bait!

        // Original loop
//      do {
//          castForFish();
//          /* Check to see if bait is available */
//          if (fishingSession.isBaitAvailable() == false) {
//              /* Place a new piece of bait on the hook */
//              fishingSession.setBaitAvailable(true);
//              piecesOfBait--;
//          }
//      } while (piecesOfBait != 0);
        
        // Refactored loop
        while (piecesOfBait > 0) {
            castForFish();
            /* Check to see if bait is available */
            if (!fishingSession.isBaitAvailable()) {
                /* Place a new piece of bait on the hook */
                fishingSession.setBaitAvailable(true);
                piecesOfBait--;
            }
        }
        System.out.println("No more pieces of bait.");
    }
}
