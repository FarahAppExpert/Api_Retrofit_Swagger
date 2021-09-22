package com.example.api_practice.utilities

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

class RxUtils {

    companion object {

        public fun  unsubscribeIfNotNull(subscription : Subscription)
        {
            if (subscription != null) {
                subscription.unsubscribe();
            }
        }

        public fun getNewCompositeSubIfUnsubscribed(subscription : CompositeSubscription ) :CompositeSubscription
        {
            if (subscription == null || subscription.isUnsubscribed()) {
                return CompositeSubscription ();
            }

            return subscription;
        }
    }
}