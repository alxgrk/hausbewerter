package react

import react.data.*

fun RBuilder.button(data: ButtonData) = child(Button::class) {
    attrs {
        this.waves = data.waves
        this.floating = data.floating
        this.node = data.node ?: undefined
        this.href = data.href ?: undefined
    }
    +data.text
}

fun RBuilder.navBar(data: NavBarData, children: List<NavItemData>) = child(NavBar::class) {
    attrs {
        this.brand = data.brand
        this.right = data.right
        this.left = data.left
        this.fixed = data.fixed
    }
    children.forEach {
        navItem(it)
    }
}

fun RBuilder.navItem(data: NavItemData) = child(NavItem::class) {
    attrs {
        this.href = data.href
        this.onClick = data.onClick
        this.divider = data.divider
    }
    +data.text
}

fun RBuilder.parallax(data: ParallaxData) = child(Parallax::class) {
    attrs {
        this.imageSrc = data.imageSrc
    }
}

fun RBuilder.input(data: InputData) = child(Input::class) {
    attrs {
        this.label = data.label
        this.placeholder = data.placeholder ?: undefined
        this.type = data.type
        this.onChangeFunction = data.onChangeFunction
    }
}

fun RBuilder.card(data: CardData) = child(Card::class) {
    attrs {
        this.reveal = data.reveal
        this.title = data.title
    }
    cardTitle(data.headerData)
    data.child.invoke(this)
}

fun RBuilder.cardTitle(data: CardTitleData) = child(CardTitle::class) {
    attrs {
        this.image = data.image
        this.reveal = data.reveal
        this.waves = data.waves
    }
    +data.text
}

fun RBuilder.row(data: RowData) = child(Row::class) {
    data.children.forEach {
        col(it)
    }
}

fun RBuilder.col(data: ColData) = child(Col::class) {
    attrs {
        this.s = data.s
        this.m = data.m
        this.l = data.l
        this.className = data.className
    }
    data.handler.invoke(this)
}

