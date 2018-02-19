package com.upco.kloset.model

import android.util.Log
import com.upco.kloset.contract.ClosetContract
import com.upco.kloset.repository.LooksDataSource
import com.upco.kloset.repository.LooksRepository
import com.upco.kloset.presenter.ClosetPresenter
import com.upco.kloset.model.entity.Look
import com.upco.kloset.model.entity.Item
import com.upco.kloset.repository.ItemsDataSource
import com.upco.kloset.repository.ItemsRepository
import java.util.*

/**
 * Created by felps on 20/10/17.
 */
class ClosetModel(val presenter: ClosetPresenter): ClosetContract.ModelImpl {

    override fun retrieveLooks() {

        /*
        val images = arrayListOf(
                "https://i.pinimg.com/736x/0b/e4/a9/0be4a983c6041a202ea15e61a81a2c6f--crochet-boleros-freeform-crochet.jpg",
                "https://i.pinimg.com/736x/9d/a8/23/9da8236fd5c09037373dec787a4b988a--pumas.jpg",
                "https://static.wixstatic.com/media/c137d1_ef9faf86b709423fbccadf129e55ed51~mv2.jpg_256",
                "http://www.porcelanasfelix.com.br/imagens/roupas/2.fw.png"
        )

        val items = arrayListOf(
                Item(0, "ahdouhsa", "Short", images),
                Item(1, "ahdouhsb", "Blusa", images),
                Item(2, "ahdouhsc", "Conjunto Preto", images),
                Item(3, "ahdouhsd", "Tenis", images)
        )

        val looks = arrayListOf(
                Look(0, "hdawuhoudhasid", "Look de Inverno", 0, 4, 2, 10, 2),
                Look(1, "hdawuhoudhasie", "Look de Verão", 0, 4, 14, 1, 0)
        )
        presenter.updateLooks(looks)
        */

        LooksRepository.getLooks("fa83107f-e67f-4097-bdec-4daabe26965b", object: LooksDataSource.LoadLooksCallback {
            override fun onLooksLoaded(looks: ArrayList<Look>) {
                presenter.updateLooks(looks)
            }

            override fun onDataNotAvailable() {
                Log.e("Tagão", "Dados não disponíveis")
            }
        })
    }

    fun generateRandomLooks() {
        val rand = Random()
        val look = Look(0, "", "", 0, arrayListOf(), 5, 5, 5, 5, "", "")
        val items = arrayListOf(
            Item(0, "", "Item de Teste #1", "https://picsum.photos/50/?random","", ""),
            Item(0, "", "Item de Teste #2", "https://picsum.photos/50/?random","", ""),
            Item(0, "", "Item de Teste #3", "https://picsum.photos/50/?random","", ""),
            Item(0, "", "Item de Teste #4", "https://picsum.photos/50/?random","", ""),
            Item(0, "", "Item de Teste #5", "https://picsum.photos/50/?random","", ""),
            Item(0, "", "Item de Teste #6", "https://picsum.photos/50/?random","", ""),
            Item(0, "", "Item de Teste #7", "https://picsum.photos/50/?random","", ""),
            Item(0, "", "Item de Teste #8", "https://picsum.photos/50/?random","", ""),
            Item(0, "", "Item de Teste #9", "https://picsum.photos/50/?random","", ""),
            Item(0, "", "Item de Teste #10", "https://picsum.photos/50/?random","", "")
        )

        var lookUid_ = "98ac478e-a809-48a3-a187-f255eb6835ee"
        for (index in 1..50) {
            look.title = "Look de Teste #" + index
            LooksRepository.saveLook("fa83107f-e67f-4097-bdec-4daabe26965b", look, object: LooksDataSource.SaveLookCallback {
                override fun onLookSaved(lookUid: String) {
                    Log.d("Tagão", "Look salvo com sucesso: " + lookUid)
                }

                override fun onError() {
                    Log.e("Tagão", "Os dados não foram salvos")
                }
            })
        }

        for (itemIndex in 1..4) {
            val item = items[rand.nextInt(9)]
            ItemsRepository.saveItem("fa83107f-e67f-4097-bdec-4daabe26965b", lookUid_, item, object: ItemsDataSource.SaveItemCallback {
                override fun onItemSaved(itemUid: String) {
                    Log.d("Tagão", "Look salvo com sucesso")
                }

                override fun onError() {
                    Log.e("Tagão", "Os dados não foram salvos")
                }
            })
        }
    }

    override fun retrieveItems(lookUid: String) {
        ItemsRepository.getItems("fa83107f-e67f-4097-bdec-4daabe26965b", lookUid, object: ItemsDataSource.LoadItemsCallback {
            override fun onItemsLoaded(items: ArrayList<Item>) {
                presenter.updateItems(lookUid, items)
            }

            override fun onDataNotAvailable() {
                Log.e("Tagão", "Dados não disponíveis")
            }
        })
    }

    override fun getSelectedLook() = LooksRepository.selectedLook

    override fun setSelectedLook(look: Look) { LooksRepository.selectedLook = look }

    override fun getSelectedItem() = ItemsRepository.selectedItem

    override fun setSelectedItem(item: Item) { ItemsRepository.selectedItem = item }
}