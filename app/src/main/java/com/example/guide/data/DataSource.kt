package com.example.guide.data

import com.example.guide.R


val topic: List<Pair<Int, List<Pair<Int, List<TopicUIState>>>>> = listOf(
    /** Список тем по физике */
    Pair(
        R.string.physics,
        listOf(
            Pair(
                R.string.topic_label_mkt,
                listOf(
                    TopicUIState(name = R.string.sub_topic_label_mkt, content = R.string.sub_topic_body_mkt),
                    TopicUIState(name = R.string.sub_topic_label_gaz, content = R.string.sub_topic_body_gaz),
                    TopicUIState(name = R.string.sub_topic_label_osn_yravn_mkt, content = R.string.sub_topic_body_osn_yravn_mkt,
                        images = listOf(
                            Pair(R.drawable.osn_yravn_mkt, R.string.description_image_osn_yravn_mkt),
                            Pair(R.drawable.sred_kvadr_scor, R.string.description_image_sred_kvadr_scor),
                            Pair(R.drawable.konz, R.string.description_image_konz),
                            Pair(R.drawable.sred_davl_gaz, R.string.description_image_sred_davl_gaz)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_kin_energ, content = R.string.sub_topic_body_kin_energ,
                        images = listOf(
                            Pair(R.drawable.kin_energ_one_molek, R.string.description_image_kin_energ_one_molek),
                            Pair(R.drawable.sred_kvadr_scor_one_molek, R.string.description_image_sred_kvadr_scor_one_molek)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_kelvin, content = R.string.sub_topic_body_kelvin,
                        images = listOf(
                            Pair(R.drawable.zelc_to_kelvin, R.string.description_image_zelc_to_kelvin),
                            Pair(R.drawable._0_kelvin, R.string.description_image_0_kelvin)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_kol_veshestva,
                        images = listOf(
                            Pair(R.drawable.mol, R.string.description_image_mol),
                            Pair(R.drawable.kol_veshestva, R.string.description_image_kol_veshestva)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_mol_massa, content = R.string.sub_topic_body_mol_massa,
                        images = listOf(
                            Pair(R.drawable.mol_massa_h2o, R.string.description_image_mol_massa_h2o)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_yravn_gaz,
                        images = listOf(
                            Pair(R.drawable.yravn_klayp_mend_1, R.string.description_image_yravn_klayp_mend_1),
                            Pair(R.drawable.yravn_klayp_mend_2, R.string.description_image_yravn_klayp_mend_2)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_izoprocess, content = R.string.sub_topic_body_izoprocess,
                        images = listOf(
                            Pair(R.drawable.izoterm, R.string.description_image_izoterm),
                            Pair(R.drawable.izohorn, R.string.description_image_izohorn),
                            Pair(R.drawable.izobarn, R.string.description_image_izobarn)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_graph_izoprocess,
                        images = listOf(
                            Pair(R.drawable.graph_izoprocess, R.string.description_image_graph_izoprocess)
                        )
                    )
                )
            ),
            Pair(
                R.string.topic_label_term,
                listOf(
                    TopicUIState(name = R.string.sub_topic_label_term_1, under = R.string.sub_topic_under_term_1,
                        images = listOf(
                            Pair(R.drawable.term_1, R.string.description_image_term_1),
                            Pair(R.drawable.term_2, R.string.description_image_term_2),
                            Pair(R.drawable.term_3, R.string.description_image_term_3),
                            Pair(R.drawable.term_4, R.string.description_image_term_4),
                            Pair(R.drawable.term_5, R.string.description_image_term_5),
                            Pair(R.drawable.term_6, R.string.description_image_term_6),
                            Pair(R.drawable.term_7, R.string.description_image_term_7),
                            Pair(R.drawable.term_8, R.string.description_image_term_8),
                            Pair(R.drawable.term_9, R.string.description_image_term_9),
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_term_2,
                        images = listOf(
                            Pair(R.drawable.term_10, R.string.description_image_term_10)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_term_3, content = R.string.sub_topic_body_term_3,
                        images = listOf(
                            Pair(R.drawable.term_11, R.string.description_image_term_11),
                            Pair(R.drawable.term_12, R.string.description_image_term_12)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_term_4, content = R.string.sub_topic_body_term_4,
                        images = listOf(
                            Pair(R.drawable.term_13, R.string.description_image_term_13),
                            Pair(R.drawable.term_14, R.string.description_image_term_14),
                            Pair(R.drawable.term_15, R.string.description_image_term_15)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_term_5,
                        images = listOf(
                            Pair(R.drawable.term_16, R.string.description_image_term_16),
                            Pair(R.drawable.term_17, R.string.description_image_term_17)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_term_6,
                        images = listOf(
                            Pair(R.drawable.term_18, R.string.description_image_term_18),
                            Pair(R.drawable.term_19, R.string.description_image_term_19)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_term_7, content = R.string.sub_topic_body_term_7,
                        images = listOf()
                    ),
                    TopicUIState(name = R.string.sub_topic_label_term_8,
                        images = listOf(
                            Pair(R.drawable.term_20, R.string.description_image_term_20)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_term_9,
                        images = listOf(
                            Pair(R.drawable.term_21, R.string.description_image_term_21),
                            Pair(R.drawable.term_22, R.string.description_image_term_22),
                            Pair(R.drawable.term_23, R.string.description_image_term_23),
                            Pair(R.drawable.term_24, null)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_term_10, content = R.string.sub_topic_body_term_10,
                        images = listOf(
                            Pair(R.drawable.term_25, R.string.description_image_term_25),
                            Pair(R.drawable.term_26, R.string.description_image_term_26),
                            Pair(R.drawable.term_27, R.string.description_image_term_27)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_term_11, content = null,
                        images = listOf(
                            Pair(R.drawable.term_28, R.string.description_image_term_28),
                            Pair(R.drawable.term_29, R.string.description_image_term_29)
                        )
                    ),
                )
            ),
            Pair(
                R.string.topic_label_tepl,
                listOf(
                    TopicUIState(name = R.string.sub_topic_label_tepl_1, content = null,
                        images = listOf(
                            Pair(R.drawable.tepl_1, R.string.description_image_tepl_1),
                            Pair(R.drawable.tepl_2, R.string.description_image_tepl_2),
                            Pair(R.drawable.tepl_3, R.string.description_image_tepl_3),
                            Pair(R.drawable.tepl_4, R.string.description_image_tepl_4),
                            Pair(R.drawable.tepl_5, R.string.description_image_tepl_5),
                            Pair(R.drawable.tepl_6, R.string.description_image_tepl_6),
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_tepl_2, content = null,
                        images = listOf(
                            Pair(R.drawable.tepl_7, R.string.description_image_tepl_7),
                            Pair(R.drawable.tepl_8, R.string.description_image_tepl_8),
                            Pair(R.drawable.tepl_9, R.string.description_image_tepl_9),
                            Pair(R.drawable.tepl_10, R.string.description_image_tepl_10),
                        )
                    )
                )
            ),
            Pair(
                R.string.topic_label_par,
                listOf(
                    TopicUIState(name = R.string.sub_topic_label_par_1, under = R.string.sub_topic_under_par_1,
                        images = listOf(
                            Pair(R.drawable.par_1, R.string.description_image_par_1),
                            Pair(R.drawable.par_2, R.string.description_image_par_2)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_par_2, under = R.string.sub_topic_under_par_2
                    ),
                    TopicUIState(name = R.string.sub_topic_label_par_3, under = R.string.sub_topic_under_par_3,
                        images = listOf(
                            Pair(R.drawable.par_3, R.string.description_image_par_3),
                            Pair(R.drawable.par_4, R.string.description_image_par_4),
                            Pair(R.drawable.par_5, R.string.description_image_par_5)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_par_4,
                        images = listOf(
                            Pair(R.drawable.par_6, R.string.description_image_par_6)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_par_5, under = R.string.sub_topic_under_par_5,
                        images = listOf(
                            Pair(R.drawable.par_7, R.string.description_image_par_7)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_par_6, under = R.string.sub_topic_under_par_6,
                        images = listOf(
                            Pair(R.drawable.par_8, R.string.description_image_par_8)
                        )
                    )
                )
            ),
            Pair(
                R.string.topic_label_politrop,
                listOf(
                    TopicUIState(name = R.string.sub_topic_label_politrop_1,
                        images = listOf(
                            Pair(R.drawable.politrop_1, R.string.description_image_politrop_1),
                            Pair(R.drawable.politrop_2, R.string.description_image_politrop_2),
                            Pair(R.drawable.politrop_3, R.string.description_image_politrop_3),
                            Pair(R.drawable.politrop_4, R.string.description_image_politrop_4)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_politrop_2, content = R.string.sub_topic_body_politrop_2,
                        images = listOf(
                            Pair(R.drawable.politrop_5, R.string.description_image_politrop_5),
                            Pair(R.drawable.politrop_6, R.string.description_image_politrop_6),
                            Pair(R.drawable.politrop_7, R.string.description_image_politrop_7),
                            Pair(R.drawable.politrop_8, R.string.description_image_politrop_8),
                            Pair(R.drawable.politrop_9, R.string.description_image_politrop_9),
                            Pair(R.drawable.politrop_10, R.string.description_image_politrop_10),
                            Pair(R.drawable.politrop_11, R.string.description_image_politrop_11),
                            Pair(R.drawable.politrop_12, R.string.description_image_politrop_12),
                            Pair(R.drawable.politrop_13, R.string.description_image_politrop_13),
                            Pair(R.drawable.politrop_14, R.string.description_image_politrop_14),
                            Pair(R.drawable.politrop_15, R.string.description_image_politrop_15),
                            Pair(R.drawable.politrop_16, R.string.description_image_politrop_16),
                            Pair(R.drawable.politrop_17, R.string.description_image_politrop_17),
                            Pair(R.drawable.politrop_18, R.string.description_image_politrop_18)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_politrop_3, content = R.string.sub_topic_body_politrop_3,
                        images = listOf(
                            Pair(R.drawable.politrop_19, R.string.description_image_politrop_19),
                            Pair(R.drawable.politrop_20, R.string.description_image_politrop_20)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_politrop_4,
                        images = listOf(
                            Pair(R.drawable.politrop_21, R.string.description_image_politrop_21)
                        )
                    )
                )
            )
        )
    ),
    /** Список тем по геометрии */
    Pair(
        R.string.geometry,
        listOf(
            Pair(
                R.string.topic_label_aks,
                listOf(
                    TopicUIState(name = R.string.sub_topic_label_aks_1,
                        images = listOf(
                            Pair(R.drawable.aks_1, R.string.description_image_aks_1),
                            Pair(R.drawable.aks_2, R.string.description_image_aks_2),
                            Pair(R.drawable.aks_3, R.string.description_image_aks_3),
                            Pair(R.drawable.aks_4, R.string.description_image_aks_4)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_aks_2, under = R.string.sub_topic_under_aks_2),
                    TopicUIState(name = R.string.sub_topic_label_aks_3, under = R.string.sub_topic_under_aks_3,
                        images = listOf(
                            Pair(R.drawable.aks_5, R.string.description_image_aks_5),
                            Pair(R.drawable.aks_6, R.string.description_image_aks_6),
                            Pair(R.drawable.aks_7, R.string.description_image_aks_7)
                        )
                    )
                )
            ),
            Pair(
                R.string.topic_label_treyg,
                listOf(
                    TopicUIState(name = R.string.sub_topic_label_treyg_1,
                        images = listOf(
                            Pair(R.drawable.treyg_1, R.string.description_image_treyg_1),
                            Pair(R.drawable.treyg_2, R.string.description_image_treyg_2),
                            Pair(R.drawable.treyg_3, R.string.description_image_treyg_3),
                            Pair(R.drawable.treyg_4, R.string.description_image_treyg_4)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_treyg_2, under = R.string.sub_topic_under_treyg_2,
                        images = listOf(
                            Pair(R.drawable.treyg_5, R.string.description_image_treyg_5),
                            Pair(R.drawable.treyg_6, R.string.description_image_treyg_6)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_treyg_3,
                        images = listOf(
                            Pair(R.drawable.treyg_7, R.string.description_image_treyg_7)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_treyg_4,
                        images = listOf(
                            Pair(R.drawable.treyg_8, R.string.description_image_treyg_8),
                            Pair(R.drawable.treyg_9, R.string.description_image_treyg_9),
                            Pair(R.drawable.treyg_10, R.string.description_image_treyg_10)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_treyg_5,
                        images = listOf(
                            Pair(R.drawable.treyg_11, R.string.description_image_treyg_11),
                            Pair(R.drawable.treyg_12, R.string.description_image_treyg_12),
                            Pair(R.drawable.treyg_13, R.string.description_image_treyg_13)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_treyg_6, under = R.string.sub_topic_under_treyg_6,
                        images = listOf(
                            Pair(R.drawable.treyg_14, R.string.description_image_treyg_14)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_treyg_7,
                        images = listOf(
                            Pair(R.drawable.treyg_15, R.string.description_image_treyg_15)
                        )
                    )
                )
            ),
            Pair(
                R.string.topic_label_chet,
                listOf(
                    TopicUIState(name = R.string.sub_topic_label_chet_1, under = R.string.sub_topic_under_chet_1,
                        images = listOf(
                            Pair(R.drawable.chet_1, R.string.description_image_chet_1)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_chet_2, under = R.string.sub_topic_under_chet_2,
                        images = listOf(
                            Pair(R.drawable.chet_2, R.string.description_image_chet_2),
                            Pair(R.drawable.chet_3, R.string.description_image_chet_3),
                            Pair(R.drawable.chet_4, R.string.description_image_chet_4)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_chet_3, under = R.string.sub_topic_under_chet_3,
                        images = listOf(
                            Pair(R.drawable.chet_5, R.string.description_image_chet_5),
                            Pair(R.drawable.chet_6, R.string.description_image_chet_6)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_chet_4,
                        images = listOf(
                            Pair(R.drawable.chet_7, R.string.description_image_chet_7)
                        )
                    )
                )
            ),
            Pair(
                R.string.topic_label_okr,
                listOf(
                    TopicUIState(name = R.string.sub_topic_label_okr_1, under = R.string.sub_topic_under_okr_1,
                        images = listOf(
                            Pair(R.drawable.okr_1, R.string.description_image_okr_1),
                            Pair(R.drawable.okr_2, R.string.description_image_okr_2)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_okr_2,
                        images = listOf(
                            Pair(R.drawable.okr_3, R.string.description_image_okr_3),
                            Pair(R.drawable.okr_4, R.string.description_image_okr_4),
                            Pair(R.drawable.okr_5, R.string.description_image_okr_5),
                            Pair(R.drawable.okr_6, R.string.description_image_okr_6),
                            Pair(R.drawable.okr_7, R.string.description_image_okr_7),
                            Pair(R.drawable.okr_8, R.string.description_image_okr_8),
                            Pair(R.drawable.okr_9, R.string.description_image_okr_9)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_okr_3, under = R.string.sub_topic_under_okr_3,
                        images = listOf(
                            Pair(R.drawable.okr_10, R.string.description_image_okr_10),
                            Pair(R.drawable.okr_11, R.string.description_image_okr_11)
                        )
                    )
                )
            ),
            Pair(
                R.string.topic_label_plos,
                listOf(
                    TopicUIState(name = R.string.sub_topic_label_plos_1,
                        images = listOf(
                            Pair(R.drawable.plos_1, R.string.description_image_plos_1),
                            Pair(R.drawable.plos_2, R.string.description_image_plos_2),
                            Pair(R.drawable.plos_3, R.string.description_image_plos_3),
                            Pair(R.drawable.plos_4, R.string.description_image_plos_4),
                            Pair(R.drawable.plos_5, R.string.description_image_plos_5),
                            Pair(R.drawable.plos_6, R.string.description_image_plos_6),
                            Pair(R.drawable.plos_7, R.string.description_image_plos_7),
                            Pair(R.drawable.plos_8, R.string.description_image_plos_8),
                            Pair(R.drawable.plos_9, R.string.description_image_plos_9),
                            Pair(R.drawable.plos_10, R.string.description_image_plos_10),
                            Pair(R.drawable.plos_11, R.string.description_image_plos_11),
                            Pair(R.drawable.plos_12, R.string.description_image_plos_12),
                            Pair(R.drawable.plos_13, R.string.description_image_plos_13),
                            Pair(R.drawable.plos_14, R.string.description_image_plos_14)
                        )
                    )
                )
            ),
            Pair(
                R.string.topic_label_kord,
                listOf(
                    TopicUIState(name = R.string.sub_topic_label_kord_1, under = R.string.sub_topic_under_kord_1),
                    TopicUIState(name = R.string.sub_topic_label_kord_2, under = R.string.sub_topic_under_kord_2)
                )
            )
        )
    )
)