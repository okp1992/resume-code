import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import behavior.TestAggressiveBehavior;
import behavior.TestDefensiveBehavior;
import behavior.TestGenericBehavior;
import behavior.TestPassiveBehavior;
import potion.TestGenericPotion;
import potion.TestHealthPotion;
import potion.TestSabatagePotion;
import armor.TestGenericArmor;
import armor.TestHeavyArmor;
import armor.TestHeavyReinforcement;
import armor.TestWeakArmor;
import armor.TestWeakReinforcement;
import timer.TestSimpleTimer;
import weapons.TestGenericWeapon;
import weapons.TestLargeUpgrade;
import weapons.TestLargeWeapon;
import weapons.TestSmallUpgrade;
import weapons.TestSmallWeapon;
import entities.TestEntity;
import entities.TestMonster;
import entities.TestObserver;
import entities.TestPerson;

@RunWith(Suite.class)  
@Suite.SuiteClasses(  
{
TestGenericArmor.class,
TestHeavyArmor.class,
TestHeavyReinforcement.class,
TestWeakArmor.class,
TestWeakReinforcement.class,
TestAggressiveBehavior.class,
TestDefensiveBehavior.class,
TestGenericBehavior.class,
TestPassiveBehavior.class,
TestEntity.class,
TestMonster.class,
TestObserver.class,
TestPerson.class,
TestGenericPotion.class,
TestHealthPotion.class,
TestSabatagePotion.class,
TestSimpleTimer.class,
TestGenericWeapon.class,
TestLargeUpgrade.class,
TestLargeWeapon.class,
TestSmallUpgrade.class,
TestSmallWeapon.class
})

public class AllTests  
{  
}
