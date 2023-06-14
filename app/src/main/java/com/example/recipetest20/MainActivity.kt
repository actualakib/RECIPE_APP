package com.example.recipetest20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ToggleButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextButton = findViewById<Button>(R.id.next)

        val tbcoven = findViewById<ToggleButton>(R.id.tbcoven)
        val tbroven = findViewById<ToggleButton>(R.id.tbroven)
        val tbmoven = findViewById<ToggleButton>(R.id.tbmoven)
        val tbdoven = findViewById<ToggleButton>(R.id.tbdoven)
        val tbstovetops = findViewById<ToggleButton>(R.id.tbstovetops)
        val tbclayoven = findViewById<ToggleButton>(R.id.tbclayoven)
        val tbbamboo = findViewById<ToggleButton>(R.id.tbbamboo)
        val tbmandp = findViewById<ToggleButton>(R.id.tbmandp)
        val tbbamboos = findViewById<ToggleButton>(R.id.tbbamboos)
        val tbricec = findViewById<ToggleButton>(R.id.tbricec)
        val tbpressercooker = findViewById<ToggleButton>(R.id.tbpressercooker)
        val tbcpot = findViewById<ToggleButton>(R.id.tbcpot)
        val tbricestrainer = findViewById<ToggleButton>(R.id.tbricestrainer)
        val tbclaypot = findViewById<ToggleButton>(R.id.tbclaypot)
        val tvsautepan = findViewById<ToggleButton>(R.id.tvsautepan)
        val tbroastingpan = findViewById<ToggleButton>(R.id.tbroastingpan)
        val tbwokfryingpan = findViewById<ToggleButton>(R.id.tbwokfryingpan)
        val tbspan = findViewById<ToggleButton>(R.id.tbspan)
        val tbgriddle = findViewById<ToggleButton>(R.id.tbgriddle)
        val tbbbqgrill = findViewById<ToggleButton>(R.id.tbbbqgrill)
        val tbsmoker = findViewById<ToggleButton>(R.id.tbsmoker)
        val tbgfgrill = findViewById<ToggleButton>(R.id.tbgfgrill)
        val tbpachmentpaper = findViewById<ToggleButton>(R.id.tbpachmentpaper)
        val tbalfpaper = findViewById<ToggleButton>(R.id.tbalfpaper)
        val tbbakingpots = findViewById<ToggleButton>(R.id.tbbakingpots)
        val tbmuffintin = findViewById<ToggleButton>(R.id.tbmuffintin)
        val tbcakepan = findViewById<ToggleButton>(R.id.tbcakepan)
        val tbrollingpin = findViewById<ToggleButton>(R.id.tbrollingpin)
        val tbpieplate = findViewById<ToggleButton>(R.id.tbpieplate)
        val tbgrater = findViewById<ToggleButton>(R.id.tbgrater)
        val tvmandoline = findViewById<ToggleButton>(R.id.tvmandoline)
        val tbblinder = findViewById<ToggleButton>(R.id.tbblinder)
        val tbkettle = findViewById<ToggleButton>(R.id.tbkettle)
        val tbroaster = findViewById<ToggleButton>(R.id.tbroaster)
        val tbairfryer = findViewById<ToggleButton>(R.id.tbairfryer)
        val tbfoodmil = findViewById<ToggleButton>(R.id.tbfoodmil)
        val tbstandmixer = findViewById<ToggleButton>(R.id.tbstandmixer)
        val tbhandmixer = findViewById<ToggleButton>(R.id.tbhandmixer)
        val wmaker = findViewById<ToggleButton>(R.id.wmaker)


        nextButton.setOnClickListener {

            if (tbcoven.isChecked && tbroven.isChecked && tbmoven.isChecked  && tbdoven.isChecked  && tbstovetops.isChecked  && tbclayoven.isChecked  && tbbamboo.isChecked  && tbmandp.isChecked  && tbbamboos.isChecked  && tbricec.isChecked  && tbpressercooker.isChecked  && tbcpot.isChecked  && tbricestrainer.isChecked  && tbclaypot.isChecked  && tvsautepan.isChecked  && tbroastingpan.isChecked  && tbwokfryingpan.isChecked  && tbspan.isChecked  && tbgriddle.isChecked  && tbbbqgrill.isChecked  && tbsmoker.isChecked  && tbgfgrill.isChecked  && tbpachmentpaper.isChecked  && tbalfpaper.isChecked  && tbbakingpots.isChecked  && tbmuffintin.isChecked  && tbcakepan.isChecked  && tbrollingpin.isChecked  && tbpieplate.isChecked  && tbgrater.isChecked  && tvmandoline.isChecked  && tbblinder.isChecked  && tbkettle.isChecked  && tbroaster.isChecked  && tbairfryer.isChecked  && tbfoodmil.isChecked  && tbstandmixer.isChecked  && tbhandmixer.isChecked  && wmaker.isChecked  ) {
                Snackbar.make(
                    tbcoven,
                    "Nothing is selected!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                nextButton.setOnClickListener {


                    startActivity(intent)
                }
            }
        }
        tbcoven.setOnClickListener {

            if (tbcoven.isChecked) {
                Snackbar.make(
                    tbcoven,
                    "Conventional oven removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbcoven,
                    "Conventional oven added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }


        tbroven.setOnClickListener {

            if (tbroven.isChecked) {
                Snackbar.make(
                    tbroven,
                    "Regular oven removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbroven,
                    "Regular oven added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }

        tbmoven.setOnClickListener {

            if (tbmoven.isChecked) {
                Snackbar.make(
                    tbmoven,
                    "Microwave oven removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbmoven,
                    "Microwave oven added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }

        tbdoven.setOnClickListener {

            if (tbdoven.isChecked) {
                Snackbar.make(
                    tbdoven,
                    "Dutch oven removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbdoven,
                    "Dutch oven added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }

        tbstovetops.setOnClickListener {

            if (tbstovetops.isChecked) {
                Snackbar.make(
                    tbstovetops,
                    "Stovetop removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbstovetops,
                    "Stovetop added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbclayoven.setOnClickListener {

            if (tbclayoven.isChecked) {
                Snackbar.make(
                    tbclayoven,
                    "Clay oven removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbclayoven,
                    "Clay oven added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbbamboo.setOnClickListener {

            if (tbbamboo.isChecked) {
                Snackbar.make(
                    tbbamboo,
                    "Bamboo steamer removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbbamboo,
                    "Bamboo steamer added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbmandp.setOnClickListener {

            if (tbmandp.isChecked) {
                Snackbar.make(
                    tbmandp,
                    "Mortar and pestle removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbmandp,
                    "Mortar and pestle added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbbamboos.setOnClickListener {

            if (tbbamboos.isChecked) {
                Snackbar.make(
                    tbbamboos,
                    "Bamboo skewers removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbbamboos,
                    "Bamboo skewers added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbricec.setOnClickListener {

            if (tbricec.isChecked) {
                Snackbar.make(
                    tbricec,
                    "Rice cooker removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbricec,
                    "Rice cooker added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbpressercooker.setOnClickListener {

            if (tbpressercooker.isChecked) {
                Snackbar.make(
                    tbpressercooker,
                    "Pressure cooker removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbpressercooker,
                    "Pressure cooker added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbcpot.setOnClickListener {

            if (tbcpot.isChecked) {
                Snackbar.make(
                    tbcpot,
                    "Crock Pot removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbcpot,
                    "Crock Pot added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbricestrainer.setOnClickListener {

            if (tbricestrainer.isChecked) {
                Snackbar.make(
                    tbricestrainer,
                    "Rice strainer removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbricestrainer,
                    "Rice strainer added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbclaypot.setOnClickListener {

            if (tbclaypot.isChecked) {
                Snackbar.make(
                    tbclaypot,
                    "Clay pot removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbclaypot,
                    "Clay pot added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tvsautepan.setOnClickListener {

            if (tvsautepan.isChecked) {
                Snackbar.make(
                    tvsautepan,
                    "Sauté pan / saucepan removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tvsautepan,
                    "Sauté pan / saucepan added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbroastingpan.setOnClickListener {

            if (tbroastingpan.isChecked) {
                Snackbar.make(
                    tbroastingpan,
                    "Roasting pans removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbroastingpan,
                    "Roasting pans added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbwokfryingpan.setOnClickListener {

            if (tbwokfryingpan.isChecked) {
                Snackbar.make(
                    tbwokfryingpan,
                    "Wok / frying pan removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbwokfryingpan,
                    "Wok / frying pan added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbspan.setOnClickListener {

            if (tbspan.isChecked) {
                Snackbar.make(
                    tbspan,
                    "Springform pan removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbspan,
                    "Springform pan added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbgriddle.setOnClickListener {

            if (tbgriddle.isChecked) {
                Snackbar.make(
                    tbgriddle,
                    "Griddle removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbgriddle,
                    "Y added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbbbqgrill.setOnClickListener {

            if (tbbbqgrill.isChecked) {
                Snackbar.make(
                    tbbbqgrill,
                    "Barbecue grill removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbbbqgrill,
                    "Barbecue grill added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }

        tbsmoker.setOnClickListener {

            if (tbsmoker.isChecked) {
                Snackbar.make(
                    tbsmoker,
                    "Smoker grill removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbsmoker,
                    "Smoker grill added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
        tbgfgrill.setOnClickListener {

            if (tbgfgrill.isChecked) {
                Snackbar.make(
                    tbgfgrill,
                    "George Foreman Grill removed!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            } else {
                Snackbar.make(
                    tbgfgrill,
                    "George Foreman Grill added!",
                    Snackbar.LENGTH_SHORT
                )
                    .show()
            }
        }
            tbpachmentpaper.setOnClickListener {

                if (tbpachmentpaper.isChecked) {
                    Snackbar.make(
                        tbpachmentpaper,
                        "Parchment paper removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbpachmentpaper,
                        "Parchment paper added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbalfpaper.setOnClickListener {

                if (tbalfpaper.isChecked) {
                    Snackbar.make(
                        tbalfpaper,
                        "Aluminum foil paper removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbalfpaper,
                        "Aluminum foil paper added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbbakingpots.setOnClickListener {

                if (tbbakingpots.isChecked) {
                    Snackbar.make(
                        tbbakingpots,
                        "Baking sheet removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbbakingpots,
                        "Baking sheet added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbmuffintin.setOnClickListener {

                if (tbmuffintin.isChecked) {
                    Snackbar.make(
                        tbmuffintin,
                        "Muffin tin removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbmuffintin,
                        "Muffin tin added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbcakepan.setOnClickListener {

                if (tbcakepan.isChecked) {
                    Snackbar.make(
                        tbcakepan,
                        "Cake pan removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbcakepan,
                        "Cake pan added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbrollingpin.setOnClickListener {

                if (tbrollingpin.isChecked) {
                    Snackbar.make(
                        tbrollingpin,
                        "Rolling pin removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbrollingpin,
                        "Rolling pin added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbpieplate.setOnClickListener {

                if (tbpieplate.isChecked) {
                    Snackbar.make(
                        tbpieplate,
                        "Pie plate removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbpieplate,
                        "Pie plate added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbgrater.setOnClickListener {

                if (tbgrater.isChecked) {
                    Snackbar.make(
                        tbgrater,
                        "Grater removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbgrater,
                        "Grater added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tvmandoline.setOnClickListener {

                if (tvmandoline.isChecked) {
                    Snackbar.make(
                        tvmandoline,
                        "Mandoline removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tvmandoline,
                        "Mandoline added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbblinder.setOnClickListener {

                if (tbblinder.isChecked) {
                    Snackbar.make(
                        tbblinder,
                        "Blender removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbblinder,
                        "Blender added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbkettle.setOnClickListener {

                if (tbkettle.isChecked) {
                    Snackbar.make(
                        tbkettle,
                        "Kettle removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbkettle,
                        "Kettle added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbroaster.setOnClickListener {

                if (tbroaster.isChecked) {
                    Snackbar.make(
                        tbroaster,
                        "Toaster removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbroaster,
                        "Toaster added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbairfryer.setOnClickListener {

                if (tbairfryer.isChecked) {
                    Snackbar.make(
                        tbairfryer,
                        "Air fryer removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbairfryer,
                        "Air fryer added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbfoodmil.setOnClickListener {

                if (tbfoodmil.isChecked) {
                    Snackbar.make(
                        tbfoodmil,
                        "Food mill removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbfoodmil,
                        "Food mill added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbstandmixer.setOnClickListener {

                if (tbstandmixer.isChecked) {
                    Snackbar.make(
                        tbstandmixer,
                        "Stand mixer removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbstandmixer,
                        "Stand mixer added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            tbhandmixer.setOnClickListener {

                if (tbhandmixer.isChecked) {
                    Snackbar.make(
                        tbhandmixer,
                        "Hand mixer removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        tbhandmixer,
                        "Hand mixer added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }
            wmaker.setOnClickListener {

                if (wmaker.isChecked) {
                    Snackbar.make(
                        wmaker,
                        "Waffle maker removed!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                } else {
                    Snackbar.make(
                        wmaker,
                        "Waffle maker added!",
                        Snackbar.LENGTH_SHORT
                    )
                        .show()
                }
            }


        }

}