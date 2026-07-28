**Dependencies**
This project relies on standard Java core libraries (javax.swing, java.awt, java.util). There are no external third-party libraries or dependencies needed.

**How to Compile and Run**

Open Command Prompt in the root directory of the project
Ensure that the bin directory exists
     If not run _mkdir bin_
 Finally run the following commands
 1. First Run
-- for /f "delims=" %i in ('dir /s /b src\*.java') do @set "p=%i" && @call echo "%p:\=/%">>sources.txt --
 2. Then Run
-- javac -d bin -sourcepath src @sources.txt --
 3. Finally Run
-- java -cp bin main.java.ZooApplication --


**Strategy Pattern Implementation**

Strategy Interfaces: For each action an animal can do there are Behavior classes.(MoveBehavior, SoundBehavior, DietBehavior).

Concrete Strategies: Specific behaviors are in their own class that refer back to their Behavior (e.g., Fly, Walk, Slither, Swim, Roar, Growl, Carnivore, Herbivore).

Context (Animal): Can reference the created Behaviors and delegates execution to them via methods like performMove(), performSound(), and performDiet().

**Species Behavior Differences**

Each species/subspecies has its own specific logic. 
*For Example:*
Lions & Bears: Walk on four legs, roar/growl, and maintain carnivore/omnivore diets.
Birds: Fly or waddle, chirp or cluck, and maintain insectivore or herbivore diets.
Snakes & Fish: Slither or swim, hiss or remain silent.

