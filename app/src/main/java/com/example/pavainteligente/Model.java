package com.example.pavainteligente;

public class Model implements Contract.ModelMVP{

    @Override
    public void sendMessage(OnSendToPresenter presenter) {
        presenter.onFinished("Mensaje al presentador");
    }
}
