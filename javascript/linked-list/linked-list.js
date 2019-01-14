class Node {
	constructor(val){
		this.val = val
		this.prev = null
		this.next = null
	}
}

class LinkedList {
	constructor(){
		this.size = 0
		this.head = this.tail = null
	}
	push(val){
		var node = new Node(val)
		if(this.size == 0){
			this.head = this.tail = node
		} else {
			this.tail.next = node
			node.prev = this.tail
			this.tail = node
		}
		this.size++
	}
	pop(){
		this.size--
		let ret = this.tail
		if(this.size > 0){
			this.tail = this.tail.prev
			this.tail.next = null
		} else {
			this.headAndTailResetToNull()
		}
		return ret.val
	}

	shift(){
		this.size--
		let ret = this.head
		if(this.size > 0){
			this.head = this.head.next
			this.head.prev = null
		} else {
			this.headAndTailResetToNull()
		}
		return ret.val
	}

	unshift(val){
		var node = new Node(val)
		if(this.size == 0){
			this.head = this.tail = node
		} else {
			this.head.prev = node
			node.next = this.head
			this.head = node
		}
		this.size++
	}

	count(){
		return this.size
	}

	delete(val){
		let tempNode = this.head
		while(tempNode.val != val){
			tempNode = tempNode.next
		}

		if (this.size == 1){
			this.headAndTailResetToNull()
		} else if (tempNode == this.head) {
			this.head = tempNode.next
			this.head.prev = null
		} else if (tempNode == this.tail) {
			this.tail = tempNode.prev
			this.head.next = null
		} else {
			tempNode.prev.next = tempNode.next
			tempNode.next.prev = tempNode.prev
		}
		this.size--
	}

	headAndTailResetToNull(){
		this.head = this.tail = null
	}
}

module.exports=LinkedList;