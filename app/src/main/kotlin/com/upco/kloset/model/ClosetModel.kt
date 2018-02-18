package com.upco.kloset.model

import android.util.Log
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.upco.kloset.contract.ClosetContract
import com.upco.kloset.repository.LooksDataSource
import com.upco.kloset.repository.LooksRepository
import com.upco.kloset.presenter.ClosetPresenter
import com.upco.kloset.model.entity.Item
import com.upco.kloset.model.entity.Look
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

        LooksRepository.getLooks("GbD8Nxi0DdaPo6xKHNKhBwmc0Nj1", object: LooksDataSource.LoadLooksCallback {
            override fun onLooksLoaded(looks: ArrayList<Look>) {
                presenter.updateLooks(looks)
            }

            override fun onDataNotAvailable() {
                Log.e("Tagão", "Dados não disponíveis")
            }
        })
    }

    fun generateRandomData() {
        val settings = FirebaseFirestoreSettings.Builder()
                .setPersistenceEnabled(true)
                .build()
        val db = FirebaseFirestore.getInstance()
        val batch = db.batch()

        val rand = Random()
        val image = "https://picsum.photos/50/?random"
        val itemsRef = arrayListOf<DocumentReference>()
        val looksRef = arrayListOf<DocumentReference>()

        // Add items
        val item = mutableMapOf<String, Any>()
        item.put("title", "Item de Teste")
        item.put("updated_at", Date())
        item.put("created_at", Date())
        for (index in 0..10) {
            val itemRef = db.collection("items").document()
            itemsRef.add(itemRef)

            val imgs = arrayListOf<String>()
            imgs.add(image)
            imgs.add(image)
            imgs.add(image)
            imgs.add(image)

            item["uid"] = itemRef.id
            item["title"] = "Item de Teste " + index
            item["images"] = imgs

            batch.set(itemRef, item)
        }

        // Add looks
        val look = mutableMapOf<String, Any>()
        look.put("title", "Look de Teste")
        look.put("privacy", 0)
        look.put("num_items", 5)
        look.put("num_likes", 5)
        look.put("num_comments", 5)
        look.put("num_shares", 5)
        look.put("updated_at", Date())
        look.put("created_at", Date())
        for (index in 0..50) {
            val lookRef = db.collection("looks").document()
            looksRef.add(lookRef)

            val items = arrayListOf<DocumentReference>()
            items.add(itemsRef.get(rand.nextInt(itemsRef.size)))
            items.add(itemsRef.get(rand.nextInt(itemsRef.size)))
            items.add(itemsRef.get(rand.nextInt(itemsRef.size)))
            items.add(itemsRef.get(rand.nextInt(itemsRef.size)))

            look["uid"] = lookRef.id
            look["title"] = "Look de Teste " + index
            look["items"] = items

            batch.set(lookRef, look)
        }

        // Add looks references to user
        val userRef = db.collection("users").document("GbD8Nxi0DdaPo6xKHNKhBwmc0Nj1")
        batch.update(userRef, "looks", looksRef)

        batch.commit()
                .addOnCompleteListener {
                    task -> run {
                        if (task.isSuccessful) {
                            Log.d("onSuccess", "Batch commited successfully")
                        } else {
                            Log.e("onFailure", "Error commiting batch: " + task.exception)
                        }
                    }
                }
    }

    override fun getSelectedLook() = LooksRepository.selectedLook

    override fun setSelectedLook(look: Look) { LooksRepository.selectedLook = look }
}