package io.anuke.mindustry.content;

import io.anuke.arc.collection.ObjectSet;
import io.anuke.mindustry.entities.type.base.*;
import io.anuke.mindustry.game.ContentList;
import io.anuke.mindustry.type.UnitType;

public class UnitTypes implements ContentList{
    public static UnitType
        spirit, phantom,
        wraith, ghoul, revenant,
        dagger, crawler, titan, fortress, eruptor;

    @Override
    public void load(){
        spirit = new UnitType("spirit", Spirit.class, Spirit::new){{
            weapon = Weapons.healBlasterDrone;
            isFlying = true;
            drag = 0.01f;
            speed = 0.2f;
            maxVelocity = 0.8f;
            range = 50f;
            health = 60;
        }};

        dagger = new UnitType("dagger", Dagger.class, Dagger::new){{
            maxVelocity = 1.1f;
            speed = 0.2f;
            drag = 0.4f;
            hitsize = 8f;
            mass = 1.75f;
            weapon = Weapons.chainBlaster;
            health = 130;
        }};

        crawler = new UnitType("crawler", Crawler.class, Crawler::new){{
            maxVelocity = 1.1f;
            speed = 0.22f;
            drag = 0.4f;
            hitsize = 8f;
            mass = 1.75f;
            weapon = Weapons.suicideBomb;
            health = 100;
        }};

        titan = new UnitType("titan", Titan.class, Titan::new){{
            maxVelocity = 0.8f;
            speed = 0.18f;
            drag = 0.4f;
            mass = 3.5f;
            hitsize = 9f;
            rotatespeed = 0.1f;
            weapon = Weapons.flamethrower;
            health = 440;
            immunities.add(StatusEffects.burning);
        }};

        fortress = new UnitType("fortress", Fortress.class, Fortress::new){{
            maxVelocity = 0.78f;
            speed = 0.15f;
            drag = 0.4f;
            mass = 5f;
            hitsize = 10f;
            rotatespeed = 0.06f;
            weaponOffsetX = 1;
            targetAir = false;
            weapon = Weapons.artillery;
            health = 800;
        }};

        eruptor = new UnitType("eruptor", Eruptor.class, Eruptor::new){{
            maxVelocity = 0.81f;
            speed = 0.16f;
            drag = 0.4f;
            mass = 5f;
            hitsize = 9f;
            rotatespeed = 0.05f;
            weaponOffsetX = 3;
            targetAir = false;
            weapon = Weapons.eruption;
            health = 600;
            immunities = ObjectSet.with(StatusEffects.burning, StatusEffects.melting);
        }};

        wraith = new UnitType("wraith", Wraith.class, Wraith::new){{
            speed = 0.3f;
            maxVelocity = 1.9f;
            drag = 0.01f;
            mass = 1.5f;
            weapon = Weapons.chainBlaster;
            isFlying = true;
            health = 70;
        }};

        ghoul = new UnitType("ghoul", Ghoul.class, Ghoul::new){{
            health = 250;
            speed = 0.2f;
            maxVelocity = 1.4f;
            mass = 3f;
            drag = 0.01f;
            isFlying = true;
            targetAir = false;
            weapon = Weapons.bomber;
        }};

        revenant = new UnitType("revenant", Revenant.class, Revenant::new){{
            health = 250;
            mass = 5f;
            hitsize = 12f;
            speed = 0.14f;
            maxVelocity = 1.3f;
            drag = 0.01f;
            range = 80f;
            isFlying = true;
            weapon = Weapons.laserBurster;
        }};

        phantom = new UnitType("phantom", Phantom.class, Phantom::new){{
            weapon = Weapons.healBlasterDrone2;
            isFlying = true;
            drag = 0.01f;
            mass = 2f;
            speed = 0.2f;
            maxVelocity = 0.9f;
            range = 70f;
            itemCapacity = 70;
            health = 220;
            buildPower = 0.9f;
            minePower = 1.1f;
            toMine = ObjectSet.with(Items.lead, Items.copper, Items.titanium);
        }};
    }
}
