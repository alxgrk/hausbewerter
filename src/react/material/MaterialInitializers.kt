package react.material

import nav.navBrandCentralizer
import org.w3c.dom.events.Event
import react.*
import react.material.data.*
import react.router.Link
import react.router.link

fun RBuilder.button(data: ButtonData, onClick: (Event) -> Unit) = child(Button::class) {
    attrs {
        this.waves = data.waves
        this.floating = data.floating
        this.onClick = onClick
        this.node = data.node ?: undefined
        this.href = data.href ?: undefined
        this.className = data.className ?: undefined
    }
    +data.text
}

fun RBuilder.navBar(data: NavBarData, handler: RHandler<RProps>) = child(NavBar::class) {
    navBrandCentralizer()
    attrs {
        this.brand = React.createElement(Link::class.js.unsafeCast<RClass<RProps>>(),
                object : RProps {
                    var to = data.href
                },
                data.text)
        this.right = data.right
        this.left = data.left
        this.fixed = data.fixed
    }
    handler(this)
}

fun RBuilder.navItem(data: NavItemData, handler: RHandler<RProps>) = child(NavItem::class) {
    attrs {
        this.onClick = data.onClick
        this.divider = data.divider
    }
    handler(this)
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
        this.onChange = data.onChange
        this.icon = data.icon
    }
}

fun RBuilder.card(data: CardData) = child(Card::class) {
    attrs {
        this.reveal = data.reveal ?: undefined
        this.title = data.title
    }
    if (data.headerData != null) cardTitle(data.headerData!!)
    data.child(this)
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
    attrs {
        this.className = data.className
    }
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
    data.handler(this)
}

fun RBuilder.footer(data: FooterData) = child(Footer::class) {
    attrs {
        this.copyrights = data.copyrights
        this.links = data.links
        this.moreLinks = data.moreLinks
    }
    data.children(this)
}