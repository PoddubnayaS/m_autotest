# language: ru
@all
Функция: PDP. Добавление товара в корзину

	@pdp
	Структура сценария: Возможность добавления 2 товаров в корзину
		Если открыть главную страницу
		И выполнить поиск в хедере с запросом <sku1>
		И нажать на кнопку "Найти"
		И нажать на кнопку "Добавить в корзину"
		И выполнить поиск в хедере с запросом <sku2>
		И нажать на кнопку "Найти"
		И нажать на кнопку "Добавить в корзину"
  	И в хедере нажать на "Корзина"
		То открыта Корзина
  	И на странице Корзина отображается 2 товара

		Примеры:
			| sku1     | sku2     |
			| 71564559 | 71517722 |