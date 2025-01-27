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
                    TopicUIState(name = R.string.sub_topic_label_kol_veshestva, content = R.string.sub_topic_body_kol_veshestva,
                        images = listOf(
                            Pair(R.drawable.kol_veshestva, R.string.description_image_kol_veshestva)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_mol_massa, content = R.string.sub_topic_body_mol_massa,
                        images = listOf(
                            Pair(R.drawable.mol_massa_h2o, R.string.description_image_mol_massa_h2o)
                        )
                    ),
                    TopicUIState(name = R.string.sub_topic_label_yravn_gaz, content = R.string.sub_topic_body_yravn_gaz,
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
                    TopicUIState(name = R.string.sub_topic_label_graph_izoprocess, content = R.string.sub_topic_body_graph_izoprocess,
                        images = listOf(
                            Pair(R.drawable.graph_izoprocess, R.string.description_image_graph_izoprocess)
                        )
                    )
                )
            )
        )
    ),
    /** Список тем по математике */
    Pair(
        R.string.mathematics,
        listOf(
        )
    )
)