# MVVMAndroid
MVVM android With Room Database

Options:

  MVVM Structure
  Room Database
  
  
  # MVVM
  
  MVVM is one of the architectural patterns which enhances separation of concerns, it allows separating the user interface logic from the business (or the back-end) logic. Its target (with other MVC patterns goal) is to achieve the following principle “Keeping UI code simple and free of app logic in order to make it easier to manage”.

MVVM has mainly the following layers:

 - Model
Model represents the data and business logic of the app. One of the recommended implementation strategies of this layer, is to expose its data through observables to be decoupled completely from ViewModel or any other observer/consumer (This will be illustrated in our MVVM sample app below).

 - ViewModel
 ViewModel interacts with model and also prepares observable(s) that can be observed by a View. ViewModel can optionally provide hooks for the view to pass events to the model.
One of the important implementation strategies of this layer is to decouple it from the View, i.e, ViewModel should not be aware about the view who is interacting with.

 - View
 Finally, the view role in this pattern is to observe (or subscribe to) a ViewModel observable to get data in order to update UI elements accordingly.


![MVVM Description](https://miro.medium.com/max/606/1*BpxMFh7DdX0_hqX6ABkDgw.png)


# LiveData

As said above, LiveData is one of the newly introduced architecture components. LiveData is an observable data holder. This allows the components in your app to be able to observe LiveData objects for changes without creating explicit and rigid dependency paths between them. This decouples completely the LiveData object producer from the LiveData object consumer.

Adding to this, there is also a great benefit in LiveData, LiveData respects the lifecycle state of your app components (activities, fragments, services) and handles object life cycle management which ensures that LiveData objects do not leak.

    As per Google Docs, If you are already using a library like Rx or Agera, you can continue using them instead of LiveData. But in this case, it is your responsibility to handle object allocation and de-allocation per Android components life cycle.

Since LiveData respects Android Lifecycle, this means it will not invoke its observer callback unless the LiveData host (activity or fragment) is in an active state (received onStart() but did not receive onStop() for example). Adding to this, LiveData will also automatically remove the observer when the its host receives onDestroy().

LiveData will be illustrated in our MVVM sample app below.
